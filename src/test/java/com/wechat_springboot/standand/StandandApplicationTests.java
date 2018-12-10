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
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StandandApplicationTests {
    @Resource
    public Coursedao coursedao;

    @Test
    public void testdao(){
        String url = "http://localhost/api/addClass";
        Map<String, String> param = new HashMap<>();
        /*private String id;
        private String major;*/
        param.put("id","167");
        param.put("major","software");
        HttpClientUtil.doPost(url, param);
    }
}
