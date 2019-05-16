package com.lxd.springboot.study.exception;

import com.lxd.springboot.study.enums.StatusCode;

public class MyException extends RuntimeException {

    private int code;
    private String message;

    public MyException(int code,String message){
        this.code = code;
        this.message = message;
    }

    public MyException(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.message = statusCode.getMessage();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
