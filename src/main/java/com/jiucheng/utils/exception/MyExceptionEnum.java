package com.jiucheng.utils.exception;

import java.io.Serializable;

/**
 * MyException
 *
 * @auther qiaoba
 * @date 2020/9/30 0030 10:21
 **/
public enum MyExceptionEnum implements Serializable {

    CLASS_NOT_FOUND("00000","文件不存在"),
    EXCEPTION_DEMO("000001","自定义异常");


    String code;
    String message;

    private MyExceptionEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
