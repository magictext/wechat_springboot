package com.wechat_springboot.standand.dao;

import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.StuClassCard;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.UnionClassCard;
import com.wechat_springboot.standand.repository.StudentRepository;
import com.wechat_springboot.standand.wx_util.MapToObj;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Repository
public class UnionClassCardDao{
    @Resource
    JdbcTemplate jdbcTemplate;
    @Resource
    Teacherdao teacherdao;
    @Resource
    Coursedao coursedao;

    public List<ClassCardDate> SelectByClassId(String Classid) throws Exception {
        List<ClassCardDate> list=new ArrayList<>();
        String sql2="select * from union_class_card where classid=?";
        List<Map<String, Object>> maps=jdbcTemplate.queryForList(sql2,new Object[]{Classid});
        for (Map map : maps) {
            UnionClassCard unionClassCard= (UnionClassCard) MapToObj.mapToObject(map,UnionClassCard.class);
            list.add(new ClassCardDate(unionClassCard.getWeek(),unionClassCard.getTime(),unionClassCard.getRoomid(),
                    coursedao.selectNamebyId(unionClassCard.getUnionClassCardPK().getCourseid()),
                    teacherdao.selectNamebyId(unionClassCard.getTeacherid())));
        }
        return list;
    }
}
