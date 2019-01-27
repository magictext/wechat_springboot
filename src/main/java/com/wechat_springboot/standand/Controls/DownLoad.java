package com.wechat_springboot.standand.Controls;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
@RequestMapping(value = "/load")
public class DownLoad {
    @Value("${resource.Path}")
    String Path;
    @RequestMapping(value = "/download/{recoursename}")
    public void download(HttpServletResponse httpServletResponse, @PathVariable(value = "name")String coursename) throws IOException {
        String url=Path+coursename;
        ServletOutputStream outputStream = httpServletResponse.getOutputStream();
        File file=new File(url);
        FileInputStream fileInputStream=new FileInputStream(file);
        byte buffer[]=new byte[1024];
        int read = fileInputStream.read(buffer);
        while (read!=-1) {
            outputStream.write(buffer);
            read = fileInputStream.read(buffer);
        }
    }


    @RequestMapping(value = "/upload/{recoursename}")
    public void upload(HttpServletRequest httpServletRequest, @PathVariable(value = "name")String coursename) throws IOException {

    }


}
