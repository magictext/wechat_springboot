package com.wechat_springboot.standand.dao;

import com.wechat_springboot.standand.entity.Theme;
import com.wechat_springboot.standand.service.ServiceParent;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ThemeDao extends ServiceParent {
    @Resource
    JdbcTemplate jdbcTemplate;
    public List<Theme> getThemeList(String classid){
        String sql="select * from theme where classid=?";
        List<Theme> id = jdbcTemplate.queryForList(sql, Theme.class, classid);
        return id;
    }

}
