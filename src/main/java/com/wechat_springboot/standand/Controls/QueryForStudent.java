package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.service.Mainservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/teachar")
public class QueryForStudent {
    @Autowired
    Mainservice mainservice;

    @RequestMapping(value = "/selectAllStudent")
    public List<Student> selectAllStudent(){
        return mainservice.getAllSturent();
    }

    @RequestMapping(value = "quaryStudentById",method = RequestMethod.GET)
    public Student quaryStudentById(String id){
        return mainservice.selectStudentByid(id);
    }
}
