package com.jiucheng.utils.exception;

import lombok.Data;

import java.io.Serializable;

/**
 * MyException
 *
 * @auther qiaoba
 * @date 2020/9/30 0030 10:21
 **/

@Data
public class MyException extends Exception implements Serializable {

    String code;
    String message;

    public MyException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public MyException(MyExceptionEnum myExceptionEnum) {
        this.code = myExceptionEnum.code;
        this.message = myExceptionEnum.message;
    }

}
