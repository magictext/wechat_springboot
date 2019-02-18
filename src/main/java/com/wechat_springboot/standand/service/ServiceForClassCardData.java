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
        ArrayList<ClassCardDate> arrayList=new ArrayList<>();
        List<Map<String, Object>> maps= serviceForClassCard.selectStuClassCard(id);
        for (Map map :maps){
            ClassCardDate classCardDate=new ClassCardDate();
            classCardDate.setWeek((Integer)map.get("week"));
            classCardDate.setTime((Integer)map.get("time"));
            classCardDate.setRoomid((String) map.get("roomid"));
            classCardDate.setCoursename(coursedao.selectNamebyId((String) map.get("courseid")));
            classCardDate.setTeacherName(teacherdao.selectNamebyId((String)map.get("teacherid")));
            arrayList.add(classCardDate);
        }
        return arrayList;
    }
}
