package com.wechat_springboot.standand.webControl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class test {
    @RequestMapping(value = "/web", method = RequestMethod.GET)
    public String sayname(Model model) {
        model.addAttribute("name", "xiling");
        model.addAttribute("id", "16263616");
        return "sayname";
    }
}
