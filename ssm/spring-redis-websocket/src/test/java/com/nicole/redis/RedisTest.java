package com.nicole.redis;

import org.junit.jupiter.api.Test;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.data.redis.core.RedisTemplate;

        import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    void testDefaultRestTemplate() {
        redisTemplate.opsForValue().set("default_redis_template", "1");
        assertEquals("1", redisTemplate.opsForValue().get("default_redis_template"));
    }
}
