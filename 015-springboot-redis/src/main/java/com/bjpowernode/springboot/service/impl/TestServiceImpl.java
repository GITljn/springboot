package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public String set(String k, String v) {
        redisTemplate.opsForValue().set(k, v);
        return "OK";
    }
}
