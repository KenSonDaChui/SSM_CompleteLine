package com.jiucheng.utils.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ExceptionUtils
 *
 * @auther qiaoba
 * @date 2020/9/30 0030 10:26
 **/
public class ExceptionUtils implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        MyException myException = null;
        if (e instanceof MyException){ //自定义的异常
            myException = (MyException) e;
            System.out.println("我的自定义异常:"+myException.code +"异常信息: "+myException.message);
        }else { //不是自定义异常
            System.out.println("未知的异常: "+ e);
            myException = new MyException("99999","未知异常");
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("err");
        mv.addObject("message",myException.message);
        return mv;
    }
}
