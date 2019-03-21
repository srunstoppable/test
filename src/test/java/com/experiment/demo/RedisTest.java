package com.experiment.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author s r
 * @date 2018/12/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
public class RedisTest {


//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testRedis(){
//        stringRedisTemplate.opsForValue().set("name","test");
//        String val=stringRedisTemplate.opsForValue().get("name");
//        Assert.assertEquals("guanguan", val);
        System.out.println("123");

    }
}
