package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "hello springboot-jsp");
        mv.setViewName("message");
        System.out.println(111);
        return mv;
    }

    @RequestMapping("/index1")
    public @ResponseBody String index1() {
        return "springboot-index1";
    }
}
