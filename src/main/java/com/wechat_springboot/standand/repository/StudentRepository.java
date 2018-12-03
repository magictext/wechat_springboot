package com.wechat_springboot.standand.repository;


import com.wechat_springboot.standand.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,String> {

}
