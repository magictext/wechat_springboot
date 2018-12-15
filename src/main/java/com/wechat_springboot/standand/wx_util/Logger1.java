package com.wechat_springboot.standand.wx_util;


import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;

import javax.annotation.Resource;

import static java.lang.System.out;

public class Logger1 {
    @Value("${resource.Path}")
    int Path;

    public static void main(String args[]){
        out.println(new Logger1().Path);
    }
}
