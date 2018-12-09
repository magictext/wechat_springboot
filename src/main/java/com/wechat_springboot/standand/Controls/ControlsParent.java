package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.dao.StuClassCardDao;
import com.wechat_springboot.standand.dao.Studentdao;
import com.wechat_springboot.standand.service.BasicService;
import com.wechat_springboot.standand.service.ServiceForClassCard;
import com.wechat_springboot.standand.wx_util.RedisOperator;

import javax.annotation.Resource;

public class ControlsParent {
    @Resource
    BasicService basicService;

    @Resource
    RedisOperator redis;

    @Resource
    ServiceForClassCard serviceForClassCard;
}
