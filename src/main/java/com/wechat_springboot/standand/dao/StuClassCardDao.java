package com.wechat_springboot.standand.dao;

import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.StuClassCard;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.repository.CourseRepository;
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
    CourseRepository courseRepository;
    @Resource
    TeacherRepository teacherRepository;

    public List<ClassCardDate> SelectByStuId(String id) throws Exception {
        String sql="select * from stu_class_card where stuid=?";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql, new Object[]{id});
        List<ClassCardDate> list=new ArrayList<>();
        for (Map map : maps) {
            StuClassCard stuClassCard=(StuClassCard)MapToObj.mapToObject(map, Student.class);
            list.add(new ClassCardDate(stuClassCard.getWeek(),stuClassCard.getTime(),
                    courseRepository.findById(stuClassCard.getStuClassCardPK().getCourseid()).orElseGet(null).getCourseName(),
                    teacherRepository.findById(stuClassCard.getTeacherid()).orElseGet(null).getName()));
        }
        return list;
    }

}
