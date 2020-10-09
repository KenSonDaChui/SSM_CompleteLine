package com.jiucheng.utils;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * MyInterceptor
 *
 * @auther qiaoba
 * @date 2020/9/30 0030 11:10
 **/
public class MyInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器preHandle执行了.................");
        return true;
    }

}
