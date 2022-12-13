package com.itcast.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class SpringbootRedisApplicationTests {


    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    void contextLoads() {

        ValueOperations<String, String> ops = redisTemplate.opsForValue();

        ops.set("k1","v1");

    }

}
