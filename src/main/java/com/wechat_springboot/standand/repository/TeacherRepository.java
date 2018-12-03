package com.wechat_springboot.standand.repository;

import com.wechat_springboot.standand.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher,String> {

}
