package cn.com.egova.redis;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.Before;
import org.junit.Test;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.params.SetParams;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;

public class RedisDemo {

    private static Jedis jedis = null;

    private static Client client = null;

    private static Gson gson = new Gson();

    @Before
    public void init() {
        if (jedis == null) {
            jedis = new Jedis("localhost");
        }
        if (client==null) {
            client = new Client();
        }
    }


    @Test
    public void testRedis() throws Exception {
        SetParams setParams = new SetParams();
        setParams.ex(5);
        setParams.nx();
        jedis.set("lock", "测试", setParams);
        Thread.sleep(6000);
        jedis.set("lock", "测试1");
        System.out.println(jedis.get("lock"));


    }

    @Test
    public void testRedisOneChapter() {
        JsonObject object = new JsonObject();
        object.addProperty("name", "张三");
        object.addProperty("age", 15);
        String param = gson.toJson(object);
        jedis.set("human", param);
        System.out.println(jedis.get("human"));

        jedis.hset("human001", "name", "张三");
        jedis.hset("human001", "age", "13");
        System.out.println(jedis.hgetAll("human001"));
        Map map = jedis.hgetAll("human001");
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
    }

    @Test
    public void testHyperLogLog() {
        for (int i = 0; i < 100000; i++) {
            jedis.pfadd("codehole1", "user" + i);
        }

        for (int i = 0; i < 100000; i++) {
            jedis.pfadd("codehole2", "user" + i);
        }

        jedis.pfmerge("codehole", "codehole1", "codehole2");

        long total = jedis.pfcount("codehole");
        System.out.printf("%d %d %d %d\n", 100000, total,jedis.pfcount("codehole1"),jedis.pfcount("codehole2"));
    }

    @Test
    public void testBloom(){
        client.del("codehole");
        for (int i = 0; i < 100000; i++) {

        }
    }

    @Test
    public void testPipe(){
        Pipeline pipeline = jedis.pipelined();
        pipeline.multi();
        pipeline.zadd("qqww:23",9.0,"think in java");
        pipeline.exec();
        pipeline.close();
    }

    @Test
    public void testRedisScan(){
        Pipeline pipeline = jedis.pipelined();
        pipeline.multi();
        for (int i = 0; i < 10000; i++) {
            pipeline.set("key"+i,i+"");
        }
        pipeline.exec();
        pipeline.close();
    }
}
