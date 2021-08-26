package com.example.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class RedisStringTest {

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Test
    void testString() {
        String key = "nct";
        String data = "ncitizen";

        redisTemplate.opsForValue().set(key, data); // redis set 명령어
        String result1 = redisTemplate.opsForValue().get(key); // redis get 명령어

        assertThat(data).isEqualTo(result1);
    }
}
