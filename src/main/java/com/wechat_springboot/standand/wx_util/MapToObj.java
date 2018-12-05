package com.wechat_springboot.standand.wx_util;

import java.util.Map;

import org.apache.commons.beanutils.*;

public class MapToObj {
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {
        if (map == null)
            return null;
        Object obj = beanClass.newInstance();
        BeanUtils.populate(obj, map);
        return obj;
    }

    public static Map<?, ?> objectToMap(Object obj) {
        if (obj == null)
            return null;
        return new BeanMap(obj);
    }
}
