package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.dao.StuClassCardDao;
import com.wechat_springboot.standand.dao.Studentdao;
import com.wechat_springboot.standand.service.BasicService;
import com.wechat_springboot.standand.service.ServiceForChat;
import com.wechat_springboot.standand.service.ServiceForClassCard;
import com.wechat_springboot.standand.wx_util.RedisOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class ControlsParent {
    @Resource
    BasicService basicService;

    @Resource
    RedisOperator redis;

    @Resource
    ServiceForClassCard serviceForClassCard;

    @Resource
    ServiceForChat serviceForChat;

    Logger logger=LoggerFactory.getLogger("Control");
}
