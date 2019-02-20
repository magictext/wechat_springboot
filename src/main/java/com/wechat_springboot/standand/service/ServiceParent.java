package com.wechat_springboot.standand.service;

import com.wechat_springboot.standand.dao.*;
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
    ClassCardDataDao classCardDataDao;
    @Resource
    Studentdao studentdao;
    @Resource
    ScoreDao scoreDao;
    @Resource
    ThemeDao themeDao;
    @Resource
    ThemeRepository themeRepository;
}
