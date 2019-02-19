package com.wechat_springboot.standand.dao;

import javafx.util.Pair;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class ScoreDao {
    @Resource
    JdbcTemplate jdbcTemplate;
    @Resource
    Coursedao coursedao;

    public List<Pair> getScore(String stuid) {
        String sql = "select courseid , score from score where stuid=?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, new Object[]{stuid});
        List<Pair> list = new ArrayList<>();
        for (Map map : maps) {
            String name = coursedao.selectNamebyId((String) map.get("coureid"));
            Pair pair = new Pair(name, map.get("score"));
            list.add(pair);
        }
        return list;
    }
}
