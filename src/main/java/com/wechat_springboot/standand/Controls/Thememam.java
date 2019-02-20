package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.Theme;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/chat",method = RequestMethod.GET)
public class Thememam extends ControlsParent{
    @RequestMapping(value = "/querylist",method = RequestMethod.GET)
    public List<Theme> getlist(String session){
        String s = redis.get(session);
        return serviceForChat.getThemeList(s);
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public boolean createTheme(@RequestBody Theme theme){
        return serviceForChat.createTheme(theme);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public boolean deleteTheme(String id){
        return serviceForChat.deleteTheme(id);
    }
}
