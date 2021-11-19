package com.bjpowernode.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.springboot.model.Student;
import com.bjpowernode.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
//    @Autowired
    @Reference(interfaceClass = StudentService.class, version = "1.0.0", check = false)
    private StudentService studentService;

    @RequestMapping("/getStudent")
    public String getStudent(Integer id, Model model) {
        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);
        return "studentDetail";
    }

    @RequestMapping("/getStudentCount")
    public @ResponseBody String getStudentCount() {
        Integer count = studentService.getStudentCount();
        return count.toString();
    }
}
