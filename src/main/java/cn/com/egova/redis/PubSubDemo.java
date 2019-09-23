package cn.com.egova.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

/**
 * 消费者生产者Demo
 */
public class PubSubDemo {

    public static void main(String[] args) {
        Jedis jedis = new Jedis();
        jedis.subscribe(new JedisPubSub() {
            @Override
            public void onMessage(String channel, String message) {
                System.out.println(message);
            }
        },"codehole");
    }
}
