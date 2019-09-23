package cn.com.egova.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;

import java.util.Set;

/**
 * 简单的限流算法
 */
public class SimpleRateLimiter {

    private Jedis jedis;

    public SimpleRateLimiter(Jedis jedis) {
        this.jedis = jedis;
    }

    public boolean isActionAllowed(String userId, String actionKey, int period, int maxCount) {
        String key = String.format("hist:%s:%s", userId, actionKey);
        long nowTs = System.currentTimeMillis();
        Pipeline pipe = jedis.pipelined();
        pipe.multi();
        pipe.zadd(key, nowTs, "" + nowTs);
        pipe.zremrangeByScore(key, 0, nowTs - period * 1000);
        Response<Long> count = pipe.zcard(key);
        pipe.exec();
        pipe.close();
        System.out.println(count.get());
        return count.get() <= maxCount;
    }

    public boolean isActionAllowed1(String userId, String actionKey, int period, int maxCount) {
        String key = String.format("hist:%s:%s", userId, actionKey);
        long nowTs = System.currentTimeMillis();
        jedis.zadd(key, nowTs, "" + nowTs);
        Set<String> count = jedis.zrangeByScore(key, nowTs - period * 1000, nowTs);
        System.out.println(count);
        return count.size() <= maxCount;
    }

    public boolean isActionAllowed2(String userId, String actionKey, int period, int maxCount) {
        String key = String.format("hist:%s:%s", userId, actionKey);
        long nowTs = System.currentTimeMillis();
        jedis.zadd(key, nowTs, "" + nowTs);
        jedis.zremrangeByScore(key, 0, nowTs - period * 1000);
        Long count = jedis.zcount(key, 0, nowTs);
        return count <= maxCount;

    }

    public static void main(String[] args) throws InterruptedException {
        Jedis jedis = new Jedis("localhost");
        SimpleRateLimiter limiter = new SimpleRateLimiter(jedis);

        for (int i = 1; i <= 20; i++) {
            System.out.println(limiter.isActionAllowed2("yinchao", "reply", 1, 5));
            if (i % 6 == 0) {
                Thread.sleep(1000);
            }
        }
    }
}
