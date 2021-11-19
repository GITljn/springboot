package com.bjpowernode.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    // dubbo:reference interface="" version="" check=false
    @Reference(interfaceClass = TestService.class, version = "1.0.0", check = false)
    private TestService testService;

    @RequestMapping("/count")
    public @ResponseBody
    Object count() {
        Integer num = testService.count();
        return num;
    }
}
