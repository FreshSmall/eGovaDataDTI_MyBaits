package cn.com.egova.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.List;

/**
 * Redis事务机制
 */
public class TransactionDemo {

    private static Jedis jedis = new Jedis();

    public static int doubleAccount(String userId){
        String key = keyFor(userId);
        while (true) {
            jedis.watch(key);
            int value = Integer.valueOf(jedis.get(key));
            value *=2;
            Transaction tx = jedis.multi();
            tx.set(key,String.valueOf(value));
            List<Object> res = tx.exec();
            if (res!=null) {
                break;
            }
        }
        return Integer.parseInt(jedis.get(key));
    }

    private static String keyFor(String userId) {
        return String.format("account_%s",userId);
    }

    public static void main(String[] args) {
        String userId = "abc";
        String key = keyFor(userId);
        jedis.setnx(key,"5");
        System.out.println(doubleAccount(userId));

    }
}
