package com.wechat_springboot.standand;

import com.wechat_springboot.standand.dao.Coursedao;
import com.wechat_springboot.standand.wx_util.HttpClientUtil;
import com.wechat_springboot.standand.wx_util.IMoocJSONResult;
import com.wechat_springboot.standand.wx_util.JsonUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Time;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

//@RunWith(SpringRunner.class)
//@SpringBootTest

public class StandandApplicationTests {
    //@Resource
    //Logger logger;
    @Test
    public void test(){
        Date date=new Date();
        date.getDate();
        System.out.print(date.getTime());
    }
}
