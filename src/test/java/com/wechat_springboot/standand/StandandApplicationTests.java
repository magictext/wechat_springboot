package com.wechat_springboot.standand;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StandandApplicationTests {

    @Test
    public void contextLoads() {
        Map map=new HashMap<String,Object>();
        map.put("name","xiling");
        map.put("age",12);
        map.put("sex",true);
        System.out.print(map);
    }

}
