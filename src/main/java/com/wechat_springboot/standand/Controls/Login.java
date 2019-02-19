package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.Person;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.Teacher;
import com.wechat_springboot.standand.wx_util.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/start")
public class Login extends ControlsParent{

//    @Resource
//    BasicService basicService;
//
//    @Resource
//    private RedisOperator redis;

    @RequestMapping(value = "/loginin",method = RequestMethod.GET)
    public Map<String,Object> loginin(String code){
        System.out.println(code);
        String url="https://api.weixin.qq.com/sns/jscode2session?" +
                "appid=wx7c3fa8b4de3fa68f&" +
                "secret=5d50c86aba4cd65a0b1e1a53b5c1a194&" +
                "js_code="+code+"&" +
                "grant_type=authorization_code";
        //System.out.println(res);
        String res=HttpClientUtil.doGet(url);
        System.out.println(res);
        ModelMap modelMap=new ModelMap();
        Wechat_Session_model model= JsonUtils.jsonToPojo(res,Wechat_Session_model.class);
        redis.set(model.getSession_key(),model.getOpenid(),1000*60*30);
        modelMap.addAttribute("Session_key",model.getSession_key());
        modelMap.addAttribute("isregister",basicService.isregister(model.getOpenid()));
        return modelMap;
    }

    @RequestMapping(value = "/register/teacher",method = RequestMethod.POST)
    public Map<String,Object> registerTeacher(@RequestBody Teacher teacher, HttpServletRequest httpServletRequest) throws Exception {
        logger.error("regiserTeacher"+"\t"+teacher.toString());
        logger.error( httpServletRequest.getHeader("session_key"));
        String session_key= httpServletRequest.getHeader("session_key");
        //logger.error(cookie[0].getName()+"\t"+cookie[0].getComment()+"\t"+cookie[0].getValue());
        String uid =redis.get(session_key);
        Person person = new Person(uid,teacher.getID(),true);
        basicService.registerPersonn(person);
        logger.error(person.toString());
        HashMap map1=new HashMap();
        if(basicService.isContainsTeacher(person.getID())==true) {
            map1.put("res", "id已存在");
        }
        else {
            basicService.registerTeacher(teacher);
            map1.put("res", "success");
        }
        return map1;
    }
    @RequestMapping(value = "/register/student",method = RequestMethod.POST)
    public boolean registerStudent(String session,String id,String pass) throws Exception {
        String s = redis.get(session);
        if(basicService.checkinfo(id,pass)){
            if (basicService.registerStudent(s,id)){
                redis.set(session,s);
                return true;
            }
            return false;
        }else return false;
    }



}
