package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.wx_util.HttpClientUtil;
import com.wechat_springboot.standand.wx_util.JsonUtils;
import com.wechat_springboot.standand.wx_util.RedisOperator;
import com.wechat_springboot.standand.wx_util.Wechat_Session_model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

    @RestController
public class Login {

    @Resource
    private RedisOperator redis;

    @RequestMapping(value = "/loginin",method = RequestMethod.GET)
    public String loginin(String code){
        String url="https://api.weixin.qq.com/sns/jscode2session?" +
                "appid=wx7c3fa8b4de3fa68f&" +
                "secret=5d50c86aba4cd65a0b1e1a53b5c1a194&" +
                "js_code="+code+"&" +
                "grant_type=authorization_code";
        String res=HttpClientUtil.doGet(url);
        Wechat_Session_model model= JsonUtils.jsonToPojo(res,Wechat_Session_model.class);
        redis.set("session_key"+model.getSession_key(),"openid"+model.getOpenid(),1000*60*30);
        return model.getSession_key();
    }




//    @RequestMapping(value = "/{xiling}",method = RequestMethod.GET)
//    public Student loginin(@PathVariable("xiling")  String name){
//        Student student =new Student();
//        student.setClass("166");
//        student.setId("16263626");
//        student.setName(name);
//        return student;
//    }
}
