package com.wechat_springboot.standand.service;

import com.wechat_springboot.standand.entity.Chat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class ServiceForChat {
    Map<String, Chat> map=new HashMap<String, Chat>();

}
