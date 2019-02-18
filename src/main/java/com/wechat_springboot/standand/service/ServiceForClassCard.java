package com.wechat_springboot.standand.service;

import com.wechat_springboot.standand.dao.StuClassCardDao;
import com.wechat_springboot.standand.dao.UnionClassCardDao;
import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.Person;
import com.wechat_springboot.standand.entity.StuClassCard;
import com.wechat_springboot.standand.entity.Student;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ServiceForClassCard extends ServiceParent{
//    @Resource
//    StuClassCardDao stuClassCardDao;
//    @Resource
//    UnionClassCardDao unionClassCardDao;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Resource
    BasicService basicService;
    @Transactional
    public List<ClassCardDate> selectStuClassCard(Person person) throws Exception {
        Student student=basicService.selectStudentByid(person.getID());
        List<ClassCardDate> list=new ArrayList<>();
        list.addAll(stuClassCardDao.SelectByStuId(student.getId()));
        list.addAll(unionClassCardDao.SelectByClassId(student.getClasses()));
        return list ;
    }

    @Transactional
    public List<ClassCardDate> selectTeaClassCard(Person person) throws Exception {
        List<ClassCardDate> list=new ArrayList<>();
        list.addAll(stuClassCardDao.SelectbyTeacherId(person.getID()));
        list.addAll(unionClassCardDao.SelectbyTeacherId(person.getID()));
        return list ;
    }


    @Transactional
    public List<Map<String, Object>> selectUnionClassCard(String id) throws Exception {
        String sql="select * from union_class_card where classid=?";
        List<Map<String, Object>> maps=jdbcTemplate.queryForList(sql,new Object[]{id});
        return maps;
    }
    @Transactional
    public List<Map<String, Object>> selectStuClassCard(String id) throws Exception {
        String sql="select * from stu_class_card where stuid=?";
        List<Map<String, Object>> maps=jdbcTemplate.queryForList(sql,new Object[]{id});
        return maps;
    }



}
