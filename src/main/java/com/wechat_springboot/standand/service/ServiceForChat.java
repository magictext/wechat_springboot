package com.wechat_springboot.standand.service;

import com.wechat_springboot.standand.service.ServiceParent.*;
import com.wechat_springboot.standand.entity.Chat;
import com.wechat_springboot.standand.entity.Student;
import com.wechat_springboot.standand.entity.Theme;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ServiceForChat extends ServiceParent{
    public List<Theme> getThemeList(String stuid){
            Student student = studentRepository.findById(stuid).get();
            return themeDao.getThemeList(student.getClasses());
        }
        public boolean createTheme(Theme theme){
            try {
                themeRepository.save(theme);
                return true;
            }catch (Exception e){
                return false;
            }
        }
        public boolean deleteTheme(String id){
            try {
                themeRepository.deleteById(id);
                return true;
            }catch (Exception e){
                return false;
            }
    }


}
