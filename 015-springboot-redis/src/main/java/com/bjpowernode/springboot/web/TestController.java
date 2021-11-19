package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private TestService testService;
    @RequestMapping("/set")
    public @ResponseBody String set(String k, String v) {
        System.out.println(k+v);
        String status = testService.set(k, v);
        String result = "写入成功";
        if (!"OK".equals(status)) {
            result = "写入失败";
        }
        return result;
    }
}
