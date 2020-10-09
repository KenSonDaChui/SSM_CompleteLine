package com.jiucheng.controller;

import com.jiucheng.service.IcityService;
import com.jiucheng.utils.FileUploadUtils;
import com.jiucheng.utils.exception.MyException;
import com.jiucheng.utils.exception.MyExceptionEnum;
import com.jiucheng.vo.city;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * CityController
 *
 * @auther qiaoba
 * @date 2020/9/28 0028 16:17
 **/
@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    public IcityService cityService;


    @RequestMapping("/findAllCity.do")
    public ModelAndView findAllCity() throws Exception{

        //throw new MyException("8888","错了吧你");
        //throw new MyException(MyExceptionEnum.CLASS_NOT_FOUND);
        //int a =  10/0;
        List<city> list = cityService.findAll();
        for (city c : list) {
            System.out.println(c);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("success");
        return  modelAndView;

    }

    @RequestMapping("/fileUpload.do")
    public String fileUpload(MultipartFile file , HttpServletRequest request , HttpServletResponse response){
        Boolean upload = FileUploadUtils.upload(file, "d://path");
        if (upload){
            return "success";
        }
        return "err";
    }
}
