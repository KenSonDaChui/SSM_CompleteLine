package com.jiucheng.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * FileUploadUtils
 *
 * @auther qiaoba
 * @date 2020/9/30 0030 9:29
 **/
public class FileUploadUtils {

    public static Boolean upload(MultipartFile file , String path){
        File textFile = new File(path);
        if (!textFile.exists()){
            textFile.mkdir();
        }
        //获取文件的名称
        String filename = file.getOriginalFilename();
        //生成卫衣id
        UUID uuid = UUID.randomUUID();
        filename = uuid+filename;
        System.out.println("文件的名称:"+filename);
        try {
            file.transferTo(new File(textFile,filename));
            return true;
        }catch (IOException e){
            e.printStackTrace();
        }
        return  false;
    }
}
