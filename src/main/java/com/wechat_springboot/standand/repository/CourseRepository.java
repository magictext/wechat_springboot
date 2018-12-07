package com.wechat_springboot.standand.repository;

import com.wechat_springboot.standand.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {
}
