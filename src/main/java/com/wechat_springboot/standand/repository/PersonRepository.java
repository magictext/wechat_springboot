package com.wechat_springboot.standand.repository;

import com.wechat_springboot.standand.entity.Classroom;
import com.wechat_springboot.standand.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,String> {
}
