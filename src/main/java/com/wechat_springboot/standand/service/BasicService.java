package com.wechat_springboot.standand.service;

import com.wechat_springboot.standand.entity.Classes;
import com.wechat_springboot.standand.entity.Person;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.Teacher;
import com.wechat_springboot.standand.repository.ClassRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.collections4.IterableUtils;
import java.util.List;


@Service
public class BasicService extends ServiceParent{
//    @Resource
//    StudentRepository studentRepository;
//    @Resource
//    TeacherRepository teacherRepository;
//    @Resource
//    ClassroomRepository classroomRepository;
//    @Resource
//    ClassRepository classRepository;
//    @Resource
//    PersonRepository personRepository;


    @Transactional
    public void registerStudent(Student student){
        studentRepository.save(student);
    }

    @Transactional
    public List<Student> getAllSturent(){
        return IterableUtils.toList(studentRepository.findAll());
    }

    @Transactional
    public void registerTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }

    @Transactional
    public  List<Teacher> getAllTeacher(){
        return IterableUtils.toList(teacherRepository.findAll());
    }

    @Transactional
    public  Student selectStudentByid(String id){
        return studentRepository.findById(id).orElseGet(null);
    }

    @Transactional
    public Person findByuid(String uid){
        return personRepository.findById(uid).orElseGet(null);
    }

    @Transactional
    public void registerPersonn(Person person){
        personRepository.save(person);
    }

    @Transactional
    public boolean isregister(String uid){ return personRepository.existsById("uid");}

    @Transactional
    public void registerClass(Classes classes){ classRepository.save(classes); }
    @Transactional
    public boolean isContainsTeacher(String id){
        return teacherRepository.existsById(id);
    }
    @Transactional
    public boolean isContainsStudent(String id){
        return studentRepository.existsById(id);
    }
}