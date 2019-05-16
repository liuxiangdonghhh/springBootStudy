package com.lxd.springboot.study.enums;

public enum StatusCode {

    SUCCESS(200,"成功"),
    NOT_LOGIN(400,"用户未登录"),
    EXCEPTION(401,"异常发生"),
    PARAMS_ERROR(403,"参数错误"),
    UNKNOWN_ERROR(499,"未知错误"),
    SYSTEM_ERROR(500,"系统错误");

    private int code;
    private String message;

    StatusCode(int code,String message){
        this.code = code;
        this.message = message;
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
