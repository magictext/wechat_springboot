package com.wechat_springboot.standand.Controls;

import com.wechat_springboot.standand.wx_util.File_Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
@RequestMapping(value = "/load")
public class DownLoad {
    @Value("${web.upload-path}")
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


    @RequestMapping(value="/uploadimg", method = RequestMethod.POST)
    public String uploadImg(@RequestParam("file") MultipartFile file,HttpServletRequest request) {

        String contentType = file.getContentType();   //图片文件类型
        String fileName = file.getOriginalFilename();  //图片名字

        //文件存放路径
        String filePath = Path;
        //调用文件处理类FileUtil，处理文件，将文件写入指定位置
        try {
            File_Util.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }

        // 返回图片的存放路径
        return filePath;
    }
}
