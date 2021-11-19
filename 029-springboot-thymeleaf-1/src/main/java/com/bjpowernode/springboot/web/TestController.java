package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class TestController {
    @RequestMapping("/testJson")
    public @ResponseBody Object testJson() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 1001);
        hashMap.put("name", "zs");
        return hashMap;
    }

    @RequestMapping("/testThymeleaf")
    public String testJsp(Model model) {
        model.addAttribute("id", 1002);
        model.addAttribute("name", "ls");
        return "testThymeleaf";
    }
}
