package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.Student;

public interface StudentService {
    Student getStudent(Integer id);

    Integer getStudentCount();
}
