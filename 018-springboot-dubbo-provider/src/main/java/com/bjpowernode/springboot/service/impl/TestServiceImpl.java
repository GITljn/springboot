package com.bjpowernode.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.service.TestService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = TestService.class, version = "1.0.0")
// dubbo:service interface="" version=""
public class TestServiceImpl implements TestService {
    @Override
    public Integer count() {
        return 1250;
    }
}
