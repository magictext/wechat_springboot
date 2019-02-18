package com.wechat_springboot.standand.service;

import com.wechat_springboot.standand.dao.Coursedao;
import com.wechat_springboot.standand.dao.StuClassCardDao;
import com.wechat_springboot.standand.dao.Teacherdao;
import com.wechat_springboot.standand.dao.UnionClassCardDao;
import com.wechat_springboot.standand.repository.*;

import javax.annotation.Resource;

public class ServiceParent {
    @Resource
    StudentRepository studentRepository;
    @Resource
    TeacherRepository teacherRepository;
    @Resource
    ClassroomRepository classroomRepository;
    @Resource
    ClassRepository classRepository;
    @Resource
    PersonRepository personRepository;
    @Resource
    StuClassCardDao stuClassCardDao;
    @Resource
    UnionClassCardDao unionClassCardDao;
    @Resource
    UnionClassCardReposotory unionClassCardReposotory;
    @Resource
    Teacherdao teacherdao;
    @Resource
    Coursedao coursedao;
}
