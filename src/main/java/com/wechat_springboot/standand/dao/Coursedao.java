package com.wechat_springboot.standand.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class Coursedao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public String selectNamebyId(String id){
        String sql="select course_name from course where course_id=?";
        String name=(String)jdbcTemplate.queryForMap(sql,new Object[]{id}).get("course_name");
        return name;
    }
}
