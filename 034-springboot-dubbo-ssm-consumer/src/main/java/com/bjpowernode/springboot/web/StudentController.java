package com.bjpowernode.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Reference(interfaceClass = StudentService.class, version = "1")
    private StudentService studentService;

    @RequestMapping("/getStudent")
    public ModelAndView getStudent(Integer id) {
        Student student = studentService.getStudent(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("student", student);
        mv.setViewName("studentDetail");
        return mv;
    }
}
