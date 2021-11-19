package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Autowired
    private School school;

    @RequestMapping("/school")
    public @ResponseBody School school() {
        return school;
    }
}
