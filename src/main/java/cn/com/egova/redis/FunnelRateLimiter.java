package cn.com.egova.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * 漏斗限流
 */
public class FunnelRateLimiter {

    static class Funnel {
        //漏斗的容量大小
        int capacity;
        //漏斗流水的速率
        float leakingRate;
        //漏斗剩下的容量大小
        int leftQuota;
        //漏斗开始流水时间
        long leakingTs;

        public Funnel(int capacity, float leakingRate) {
            this.capacity = capacity;
            this.leakingRate = leakingRate;
            this.leftQuota = capacity;
            this.leakingTs = System.currentTimeMillis();
        }

        void makeSpace() {
            long nowTs = System.currentTimeMillis();
            long deltaTs = nowTs - leakingTs;
            int deltaQuota = (int) (deltaTs * leakingRate);
            //间隔时间太长，整数数字过大溢出
            if (deltaQuota < 0) {
                this.leftQuota = capacity;
                this.leakingTs = nowTs;
                return;
            }
            //腾出空间太小，最小单位是1
            if (deltaQuota < 1) {
                return;
            }

            this.leftQuota += deltaQuota;
            this.leakingTs = nowTs;
            if (this.leftQuota > this.capacity) {
                this.leftQuota = this.capacity;
            }
        }

        //给漏斗加水
        boolean watering(int quota){
            //计算漏斗剩余空间
            makeSpace();
            if (this.leftQuota>= quota) {
                this.leftQuota -=quota;
                return true;
            }
            return false;
        }
    }

    private Map<String,Funnel> funnels = new HashMap<>();

    public boolean isActionAllowed(String userId,String actionKey,int capacity,float leakingRate){
        String key = String.format("%s:%s",userId,actionKey);
        Funnel funnel = funnels.get(key);
        if (funnel==null) {
            funnel = new Funnel(capacity,leakingRate);
            funnels.put(key,funnel);
        }
        //需要1个quota
        return funnel.watering(1);
    }

    public static void main(String[] args) throws InterruptedException {
        Jedis jedis = new Jedis("localhost");
        FunnelRateLimiter funnelRateLimiter = new FunnelRateLimiter();
        for (int i = 1; i <= 20; i++) {
            System.out.println(funnelRateLimiter.isActionAllowed("yinchao", "reply", 10, 5/10000));
            if (i % 6 == 0) {
                Thread.sleep(1000);
            }
        }
    }
}
