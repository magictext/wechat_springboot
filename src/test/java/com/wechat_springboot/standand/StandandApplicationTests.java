package com.wechat_springboot.standand;

import com.wechat_springboot.standand.dao.Coursedao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StandandApplicationTests {
    @Resource
    public Coursedao coursedao;

    @Test
    public void testdao(){
        System.out.println(coursedao.selectNamebyId("166"));
        //Assert.assertArrayEquals("myname".toCharArray(),.toCharArray());
    }
}
