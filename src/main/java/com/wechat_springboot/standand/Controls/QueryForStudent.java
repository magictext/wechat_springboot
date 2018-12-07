package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/teachar")
public class QueryForStudent {
    @Autowired
    BasicService basicService;

    @RequestMapping(value = "/selectAllStudent")
    public List<Student> selectAllStudent() {
        return basicService.getAllSturent();
    }

    @RequestMapping(value = "/quaryStudentById", method = RequestMethod.GET)
    public Student quaryStudentById(String id) {
        return basicService.selectStudentByid(id);
    }
    //测试用
    @RequestMapping(value = "/getnull", method = RequestMethod.GET)
    public String getnull() {
        return "hello";
    }

}
