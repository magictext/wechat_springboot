package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.Classes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/api" )
public class ApiForSchool extends ControlsParent {
    /*
    此类api暴露给学校使用
    用于向数据库中导入教务系统中数据。
    简化学校使用难度
    */
    @RequestMapping(value = "/addClass",method = RequestMethod.POST)
    public void addClass(Classes class1){
        System.out.println("\n\n\n\n\n\n"+class1.toString()+"\n\n\n\n\n");
        basicService.registerClass(class1);
    }
    @RequestMapping(value = "/addClassCard")
    public void addClassCard(){

    }
    @RequestMapping(value = "addTeacher")
    public void addTeacher(){

    }




}
