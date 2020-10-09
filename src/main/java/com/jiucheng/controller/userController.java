package com.jiucheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * userController
 *
 * @auther qiaoba
 * @date 2020/9/29 0029 15:47
 **/
@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    public RedisTemplate redisTemplate;


    @RequestMapping("/login.do")
    public String login(@RequestParam("userId") String userId,@RequestParam("password") String password){
        Object userCheck = redisTemplate.opsForHash().get("userCheck", userId);
        if (!StringUtils.isEmpty(userCheck)&&password.equals(String.valueOf(userCheck))){
            return "index";
        }
        //默认登录成功
        redisTemplate.opsForHash().put("userCheck",userId,password);

        //Map userCheck = redisTemplate.opsForHash().entries("userCheck");
       return "success";
    }
}
