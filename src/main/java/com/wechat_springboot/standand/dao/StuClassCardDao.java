package com.wechat_springboot.standand.dao;

import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.StuClassCard;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.UnionClassCard;
import com.wechat_springboot.standand.repository.CourseRepository;
import com.wechat_springboot.standand.repository.StudentRepository;
import com.wechat_springboot.standand.repository.TeacherRepository;
import com.wechat_springboot.standand.wx_util.MapToObj;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class StuClassCardDao {
    @Resource
    JdbcTemplate jdbcTemplate;
    @Resource
    Teacherdao teacherdao;
    @Resource
    Coursedao coursedao;
    @Resource
    StudentRepository studentRepository;

    public List<ClassCardDate> SelectByStuId(String id) throws Exception {

        String sql1="select * from stu_class_card where stuid=?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql1, new Object[]{id});
        List<ClassCardDate> list=new ArrayList<>();
        for (Map map : maps) {
            StuClassCard stuClassCard=(StuClassCard)MapToObj.mapToObject(map, Student.class);
            list.add(new ClassCardDate(stuClassCard.getWeek(),stuClassCard.getTime(),stuClassCard.getRoomid(),
                    coursedao.selectNamebyId(stuClassCard.getStuClassCardPK().getCourseid()),
                    teacherdao.selectNamebyId(stuClassCard.getTeacherid())));

        }
        return list;
    }

    public List<ClassCardDate> SelectTesttime(String id) throws Exception {

        String sql1="select * from stu_class_card where stuid=?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql1, new Object[]{id});
        List<ClassCardDate> list=new ArrayList<>();
        for (Map map : maps) {
            StuClassCard stuClassCard=(StuClassCard)MapToObj.mapToObject(map, Student.class);
            list.add(new ClassCardDate(stuClassCard.getWeek(),stuClassCard.getTime(),stuClassCard.getTestroomid(),
                    coursedao.selectNamebyId(stuClassCard.getStuClassCardPK().getCourseid()),
                    teacherdao.selectNamebyId(stuClassCard.getTeacherid())));
        }
                return list;
    }
    public List<ClassCardDate> SelectbyTeacherId(String Teacherid) throws Exception {
        List<ClassCardDate> list=new ArrayList<>();
        String sql2="select * from stu_class_card where teacherid=?";
        List<Map<String, Object>> maps=jdbcTemplate.queryForList(sql2,new Object[]{Teacherid});
        for (Map map : maps) {
            UnionClassCard unionClassCard= (UnionClassCard) MapToObj.mapToObject(map,UnionClassCard.class);
            list.add(new ClassCardDate(unionClassCard.getWeek(),unionClassCard.getTime(),unionClassCard.getRoomid(),
                    coursedao.selectNamebyId(unionClassCard.getUnionClassCardPK().getCourseid()),
                    teacherdao.selectNamebyId(unionClassCard.getTeacherid())));
        }
        return list;
    }

}
