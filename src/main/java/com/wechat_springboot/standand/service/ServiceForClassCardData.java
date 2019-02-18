package com.wechat_springboot.standand.service;

import com.wechat_springboot.standand.entity.ClassCardDate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ServiceForClassCardData extends ServiceParent{
    @Resource
    ServiceForClassCard serviceForClassCard;
    public List<ClassCardDate> getunionClassCard(String id) throws Exception {
        //ArrayList<ClassCardDate> arrayList=new ArrayList<>();
        //待修改
        List<Map<String, Object>> maps= serviceForClassCard.selectUnionClassCard(id);
        maps.addAll(serviceForClassCard.selectStuClassCard(id));
        return  classCardDataDao.getUnionClassCardData(maps);
    }

}
