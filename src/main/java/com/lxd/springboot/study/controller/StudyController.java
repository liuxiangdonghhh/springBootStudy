package com.lxd.springboot.study.controller;

import com.lxd.springboot.study.enums.StatusCode;
import com.lxd.springboot.study.exception.MyException;
import com.lxd.springboot.study.result.JsonResult;
import com.lxd.springboot.study.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyController {
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping(value = "/redis/set",method = RequestMethod.POST)
    public JsonResult setRedisTest(String key,String value){
        try {
            redisUtil.set(key,value);
        } catch (Exception e){
            throw new MyException(StatusCode.EXCEPTION);
        }
        return new JsonResult(StatusCode.SUCCESS);
    }

    @RequestMapping(value = "/redis/get",method = RequestMethod.POST)
    public JsonResult getRedisTest(String key){
        String value = "";
        try {
            value = redisUtil.get(key);
        } catch (Exception e){
            throw new MyException(StatusCode.EXCEPTION);
        }
        return new JsonResult(999,value);
    }

}
