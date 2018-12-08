package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.Person;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.Teacher;
import com.wechat_springboot.standand.service.BasicService;
import com.wechat_springboot.standand.wx_util.HttpClientUtil;
import com.wechat_springboot.standand.wx_util.JsonUtils;
import com.wechat_springboot.standand.wx_util.RedisOperator;
import com.wechat_springboot.standand.wx_util.Wechat_Session_model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/start")
public class Login{

    @Resource
    BasicService basicService;

    @Resource
    private RedisOperator redis;

    @RequestMapping(value = "/loginin",method = RequestMethod.GET)
    public Map<String,Object> loginin(String code, HttpSession httpSession){
        String url="https://api.weixin.qq.com/sns/jscode2session?" +
                "appid=wx7c3fa8b4de3fa68f&" +
                "secret=5d50c86aba4cd65a0b1e1a53b5c1a194&" +
                "js_code="+code+"&" +
                "grant_type=authorization_code";
        String res=HttpClientUtil.doGet(url);
        ModelMap modelMap=new ModelMap();
        Wechat_Session_model model= JsonUtils.jsonToPojo(res,Wechat_Session_model.class);
        redis.set("session_key"+model.getSession_key(),"openid"+model.getOpenid(),1000*60*30);
        modelMap.addAttribute("Session_key()",model.getSession_key());
        modelMap.addAttribute("isregister",basicService.isregister(model.getOpenid()));
        return modelMap;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Map<String,Boolean> register(Map<String,String> map,HttpSession httpSession){
        String uid =redis.get((String) httpSession.getAttribute("session"));
        String str=(String)httpSession.getAttribute("isteacher");
        basicService.registerPersonn(new Person(uid,map.get("id"),str.equals("true")));
        if(str.equals("true")){
            basicService.registerTeacher(JsonUtils.jsonToPojo(JsonUtils.objectToJson(map),Teacher.class));
        }else {
            basicService.registerStudent(JsonUtils.jsonToPojo(JsonUtils.objectToJson(map),Student.class));
        }
        return null;
    }


}
