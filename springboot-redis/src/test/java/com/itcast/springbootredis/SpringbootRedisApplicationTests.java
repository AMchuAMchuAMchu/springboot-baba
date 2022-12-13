package com.itcast.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class SpringbootRedisApplicationTests {


    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    void contextLoads() {

//        ValueOperations<String, String> ops = redisTemplate.opsForValue();
//
//        ops.set("k1","v1");

        ListOperations<String, String> ops = redisTemplate.opsForList();

        ops.leftPushAll("l1","l1","l2","l3","l3");


    }

}
