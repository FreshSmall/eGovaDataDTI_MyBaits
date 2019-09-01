package cn.com.egova.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisDemo {

	@Test
	public void testRedis(){
		Jedis jedis = new Jedis("localhost");
		jedis.set("egova","redis");
		System.out.println(jedis.get("egova"));
		jedis.set("egova","redis1");
	}
}
