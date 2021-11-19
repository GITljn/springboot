package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping("getStudent")
    public ModelAndView getStudent() {
        Student student = new Student();
        student.setId(1001);
        student.setAge(25);
        student.setName("zs");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("studentDetail");
        mv.addObject("student", student);
        return mv;
    }

    @RequestMapping("/urlExpression")
    public ModelAndView urlExpression() {
        Student student = new Student();
        student.setId(1002);
        student.setAge(45);
        student.setName("ls");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("urlExpression");
        mv.addObject("student", student);
        return mv;
    }
}
