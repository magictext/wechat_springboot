package com.wechat_springboot.standand.dao;

import com.wechat_springboot.standand.entity.ClassCardDate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Repository
public class ClassCardDataDao {
    @Resource
    Coursedao coursedao;
    @Resource
    Teacherdao teacherdao;
    public List<ClassCardDate> getUnionClassCardData(List<Map<String, Object>> maps) throws Exception {
        ArrayList<ClassCardDate> arrayList=new ArrayList<>();
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
