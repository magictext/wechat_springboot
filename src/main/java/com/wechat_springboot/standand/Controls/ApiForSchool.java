package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.Classes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;

@RestController
@RequestMapping(value = "/api" )
public class ApiForSchool extends ControlsParent {
    /*
    此类api暴露给学校使用
    用于向数据库中导入教务系统中数据。
    简化学校使用难度
    */
    @RequestMapping(value = "/addClass",method = RequestMethod.POST)
    public void addClass(Classes class1){

        System.out.println("\n\n\n\n\n\n"+class1.toString()+"\n\n\n\n\n");
        basicService.registerClass(class1);
    }
    @RequestMapping(value = "/addClassCard")
    public void addClassCard(){
    }
    @RequestMapping(value = "getnull",method = RequestMethod.GET)
    public String getnull(){
        return "null";
    }
//    @RequestMapping(value = "/download",method =RequestMethod.GET)
//    public String download(HttpServletResponse httpServletResponse) throws IOException {
//        ServletOutputStream outputStream = httpServletResponse.getOutputStream();
//        httpServletResponse.setHeader("Content-Disposition", "attachment;fileName=mysql57-community-release-el7-8.noarch.rpm");
//        File file=new File("/home/xiling/mysql57-community-release-el7-8.noarch.rpm");
//        FileInputStream fileInputStream=new FileInputStream(file);
//        byte buffer[]=new byte[1024];
//        int read = fileInputStream.read(buffer);
//        while (read!=-1) {
//            outputStream.write(buffer);
//            read = fileInputStream.read(buffer);
//        }
//        return "download";
//    }




}
