package com.wechat_springboot.standand.dao;

import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.wx_util.MapToObj;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@Repository 持久化操作
@Repository
public class Studentdao {
    @Resource
    public JdbcTemplate jdbcTemplate;

    public List<Student> selectByClass(String ClassId) throws Exception {
        String sql = "select * from Student where class=?";
        //RowMapper<Student> rowMapper = new BeanPropertyRowMapper<>(Student.class);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, new Object[]{ClassId});
        List<Student> list = new ArrayList<>();
        for (Map map : maps) {
            list.add((Student) MapToObj.mapToObject(map, Student.class));
        }
        return list;
    }

    public List<Student> selectBymajor(String major) throws Exception {
        String sql="select * from Student where class=?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, new Object[]{major});
        List<Student> list=new ArrayList();
        for (Map map : maps) {
            list.add((Student) MapToObj.mapToObject(map, Student.class));
        }
        return list;
    }
    public String selectPassById(String id){
        String sql="select info from student where id=?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, new Object[]{id});
        for (Map map:maps
             ) {
            return (String) map.get("info");
        }
        return "";
    }
    public void registeruid(String uid,String id){
        String sql="update student set uid=? where id=?";
        jdbcTemplate.update(sql,uid,id);
    }
}
