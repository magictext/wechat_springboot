package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.dao.StuClassCardDao;
import com.wechat_springboot.standand.dao.Studentdao;
import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.Person;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.Teacher;
import com.wechat_springboot.standand.service.BasicService;
import com.wechat_springboot.standand.service.ServiceForClassCard;
import com.wechat_springboot.standand.wx_util.RedisOperator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(value = "/class",method = RequestMethod.GET)
public class QueryClassCard extends ControlsParent{
//    @Resource
//    private RedisOperator redis;
//    @Resource
//    private BasicService basicService;
//    @Resource
//    private Studentdao studentdao;
//    @Resource
//    private StuClassCardDao stuClassCardDao;
//    @Resource
//    private ServiceForClassCard serviceForClassCard;

    @RequestMapping(value = "/classcard" ,method = RequestMethod.GET)
    public List<ClassCardDate> getClassCard(HttpSession session) throws Exception {
        Person person=basicService.findByuid(redis.get((String)session.getAttribute("session")));
        if (person.isTeacher()){
            return serviceForClassCard.selectTeaClassCard(person);
        }else {
            return serviceForClassCard.selectStuClassCard(person);
        }
    }
}
