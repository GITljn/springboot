package com.bjpowernode.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceClass = StudentService.class, version = "1.0.0", timeout = 15000)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public Student getStudent(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer getStudentCount() {
        // 如果redis中有，在redis中取，没有就去mysql中取，并把取到的数据放入redis
        Integer studentCount = (Integer) redisTemplate.opsForValue().get("studentCount");
        if (null == studentCount) {
            studentCount = studentMapper.getStudentCount();
        }
        redisTemplate.opsForValue().set("studentCount", studentCount, 30, TimeUnit.SECONDS);
        return studentCount;
    }
}
