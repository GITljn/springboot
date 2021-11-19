package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    // 不登录也可访问
    @RequestMapping("/login")
    public @ResponseBody String login(HttpServletRequest request) {
        User user = new User();
        user.setId(1001);
        user.setUsername("zs");
        request.getSession().setAttribute("user", user);
        return "登录成功";
    }

    // 登录后才可访问
    @RequestMapping("/center")
    public @ResponseBody String center() {
        return "center";
    }

    // 如果未登录就访问center，则跳转到此处
    @RequestMapping("/unLogin")
    public @ResponseBody String error() {
        return "unlogin";
    }
}
