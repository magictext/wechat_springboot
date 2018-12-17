package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.Person;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.Teacher;
import com.wechat_springboot.standand.wx_util.*;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.HttpCookie;
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
        modelMap.addAttribute("Session_key()",model.getSession_key());
        modelMap.addAttribute("isregister",basicService.isregister(model.getOpenid()));
        return modelMap;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Map<String,Boolean> register(Map<String, Object> map, HttpSession httpSession, HttpCookie httpCookie) throws Exception {
        String uid =redis.get((String) httpSession.getAttribute("session"));
        String str=(String)httpSession.getAttribute("isteacher");
        basicService.registerPersonn(new Person(uid, (String) map.get("id"),str.equals("true")));
        if(str.equals("true")){
            basicService.registerTeacher((Teacher) MapToObj.mapToObject(map,Teacher.class));
        }else {
            basicService.registerStudent((Student) MapToObj.mapToObject(map,Student.class));
        }
        HashMap map1=new HashMap();
        map1.put("success",true);
        return map1;
    }


}
