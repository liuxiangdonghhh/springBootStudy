package com.lxd.springboot.study.exception;

import com.lxd.springboot.study.result.JsonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControllerException {

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public JsonResult handlerControllerException(MyException myException){
        return new JsonResult(myException.getCode(),myException.getMessage());
    }

}
