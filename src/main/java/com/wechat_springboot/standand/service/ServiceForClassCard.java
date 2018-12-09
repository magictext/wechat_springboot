package com.wechat_springboot.standand.service;

import com.wechat_springboot.standand.dao.StuClassCardDao;
import com.wechat_springboot.standand.dao.UnionClassCardDao;
import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.Person;
import com.wechat_springboot.standand.entity.StuClassCard;
import com.wechat_springboot.standand.entity.Student;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceForClassCard extends ServiceParent{
//    @Resource
//    StuClassCardDao stuClassCardDao;
//    @Resource
//    UnionClassCardDao unionClassCardDao;
    @Resource
    BasicService basicService;
    @Transactional
    public List<ClassCardDate> selectStuClassCard(Person person) throws Exception {
        Student student=basicService.selectStudentByid(person.getID());
        List<ClassCardDate> list=new ArrayList<>();
        list.addAll(stuClassCardDao.SelectByStuId(student.getId()));
        list.addAll(unionClassCardDao.SelectByClassId(student.getclass()));
        return list ;
    }

    @Transactional
    public List<ClassCardDate> selectTeaClassCard(Person person) throws Exception {
        List<ClassCardDate> list=new ArrayList<>();
        list.addAll(stuClassCardDao.SelectbyTeacherId(person.getID()));
        list.addAll(unionClassCardDao.SelectbyTeacherId(person.getID()));
        return list ;
    }

}
