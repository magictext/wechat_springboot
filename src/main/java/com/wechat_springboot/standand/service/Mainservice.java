package com.wechat_springboot.standand.service;

import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.Teacher;
import com.wechat_springboot.standand.repository.ClassRepository;
import com.wechat_springboot.standand.repository.StudentRepository;
import com.wechat_springboot.standand.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.collections4.IterableUtils;

import javax.annotation.Resource;

@Service
public class Mainservice {
    @Resource
    JdbcTemplate jdbcTemplate;
    @Resource
    StudentRepository studentRepository;
    @Resource
    TeacherRepository teacherRepository;

    @Transactional
    public void registerStudent(Student student){
        studentRepository.save(student);
    }
    @Transactional
    public void getAllSturent(){
        studentRepository.findAll();

    }

    @Transactional
    public void registerTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }
}
