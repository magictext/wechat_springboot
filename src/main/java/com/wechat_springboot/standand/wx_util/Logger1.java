package com.wechat_springboot.standand.wx_util;


import com.wechat_springboot.standand.entity.Teacher;
import com.wechat_springboot.standand.repository.TeacherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import java.util.ArrayList;


import static java.lang.System.out;

@RestController
public class Logger1 {
//    @Value("${resource.Path}")
//    int Path;
    @Resource
    JdbcTemplate jdbcTemplate;
    @Resource
    TeacherRepository teacherRepository;

    Logger logger=LoggerFactory.getLogger("test");
    public Logger1() {
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test(int classes){
        Teacher teacher=teacherRepository.findById("1000001").get();
        logger.error("mylog\n"+teacher.toString());
        //System.out.println(teacher.toString());
        if(teacher.classes==null) teacher.setClasses(new ArrayList<Integer>());
        teacher.classes.add(classes);
        teacherRepository.save(teacher);
    }

//    public static void main(String args[]){
//        out.println(new Logger1().Path);
//    }
}
