package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @PostMapping("/test")
    public @ResponseBody String test() {
        return "hello world 世界你好";
    }
}
