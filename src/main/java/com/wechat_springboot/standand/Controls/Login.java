package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;

@Controller
public class Login {
    @RequestMapping(value = "/{xiling}",method = RequestMethod.GET)
    @ResponseBody
    public Student loginin(@PathVariable("xiling")  String name){
        Student student =new Student();
        student.setClass("166");
        student.setId("16263626");
        student.setName(name);
        return student;
    }
}
