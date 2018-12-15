package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.entity.ClassCardDate;
import com.wechat_springboot.standand.entity.Classes;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
    @Value("${resource.Path}")
    String Path;
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
        logger.warn(Path);
        System.out.println(Path+"\n\n\n\n\n\n");
        return Path;
    }
    @RequestMapping(value = "/download/{name}",method =RequestMethod.GET)
    public String download(HttpServletResponse httpServletResponse,@PathVariable(value = "name")String name) throws IOException {
        ServletOutputStream outputStream = httpServletResponse.getOutputStream();
        //httpServletResponse.setHeader(, "attachment;fileName=test.mp4");
        File file=new File("E:\\test\\test.mp4");
        FileInputStream fileInputStream=new FileInputStream(file);
        byte buffer[]=new byte[1024];
        int read = fileInputStream.read(buffer);
        while (read!=-1) {
            outputStream.write(buffer);
            read = fileInputStream.read(buffer);
        }
        return "download";
    }




}
