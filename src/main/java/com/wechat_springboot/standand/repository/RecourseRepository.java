package com.wechat_springboot.standand.repository;

import com.wechat_springboot.standand.entity.Resource;
import org.springframework.data.repository.CrudRepository;

public interface RecourseRepository extends CrudRepository<Resource,String> {
}
