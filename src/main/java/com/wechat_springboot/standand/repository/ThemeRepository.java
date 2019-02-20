package com.wechat_springboot.standand.repository;

import com.wechat_springboot.standand.entity.Classroom;
import com.wechat_springboot.standand.entity.Theme;
import org.springframework.data.repository.CrudRepository;

public interface ThemeRepository extends CrudRepository<Theme,String> {
}
