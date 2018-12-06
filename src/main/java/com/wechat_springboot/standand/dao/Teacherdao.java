package com.wechat_springboot.standand.dao;

import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.Teacher;
import com.wechat_springboot.standand.wx_util.MapToObj;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class Teacherdao {
    @Resource
    public JdbcTemplate jdbcTemplate;

}
