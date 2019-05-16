package com.lxd.springboot.study.result;

import com.lxd.springboot.study.enums.StatusCode;

public class JsonResult {

    private int code;
    private String message;

    public JsonResult(){}

    public JsonResult(int code, String message){
        this.code = code;
        this.message = message;
    }

    public JsonResult(StatusCode statusCode){
        this.code = statusCode.getCode();
        this.message = statusCode.getMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
