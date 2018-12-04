package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class Login {
//    @RequestMapping(value = "/{xiling}",method = RequestMethod.GET)
//    public Student loginin(@PathVariable("xiling")  String name){
//        Student student =new Student();
//        student.setClass("166");
//        student.setId("16263626");
//        student.setName(name);
//        return student;
//    }
    @RequestMapping(value = "/loginin",method = RequestMethod.GET)
    public Student loginin(String code){
        String url="https://api.weixin.qq.com/sns/jscode2session?" +
                "appid=wx7c3fa8b4de3fa68f&" +
                "secret=5d50c86aba4cd65a0b1e1a53b5c1a194&" +
                "js_code="+code+"&" +
                "grant_type=authorization_code";

        return null;
    }
}
