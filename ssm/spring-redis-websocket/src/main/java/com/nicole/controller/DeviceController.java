package com.nicole.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DeviceController {

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(value = "/device")
    public void getDevicesInfo(@RequestBody Map<String, Object> map) {
        redisTemplate.opsForHash().putAll(map.get("id"), map);
        System.out.println(redisTemplate.opsForHash().get(map.get("id"), "name"));
    }
}
