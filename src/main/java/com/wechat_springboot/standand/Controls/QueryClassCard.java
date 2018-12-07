package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.dao.Studentdao;
import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.Person;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.service.BasicService;
import com.wechat_springboot.standand.wx_util.RedisOperator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class QueryClassCard {
    @Resource
    private RedisOperator redis;
    @Resource
    private BasicService basicService;
    @Resource
    private Studentdao studentdao;

    @RequestMapping(value = "/classcard" ,method = RequestMethod.GET)
    public List<ClassCardDate> getClassCard(HttpSession session){
        Person person=basicService.findByuid(redis.get((String)session.getAttribute("session")));
        basicService.selectStudentByid(person.getID());
        if (person.isTeacher()){

        }else {
            Student student=basicService.selectStudentByid(person.getID());
            String classid=student.getclass();
        }
        return null;
    }
}
