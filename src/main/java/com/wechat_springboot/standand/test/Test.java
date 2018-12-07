package com.wechat_springboot.standand.test;

import com.wechat_springboot.standand.entity.Teacher;
import com.wechat_springboot.standand.wx_util.JsonUtils;

import javax.rmi.CORBA.Util;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String args[]){
        Teacher teacher=new Teacher();
        teacher.setID("16236363");
        teacher.setName("duotianshi");
        teacher.setAge(27);
        String json=JsonUtils.objectToJson(teacher);
        Map<String,Object> map=new HashMap<>();
        map.put("id",16236363);
        map.put("name","duotianshi");
        map.put("age",27);
        System.out.println(json);
        System.out.println(JsonUtils.objectToJson(map));
        System.out.println(JsonUtils.jsonToPojo(JsonUtils.objectToJson(map),Teacher.class));

    }
}
