package com.lxd.springboot.study.utils;

import com.lxd.springboot.study.enums.StatusCode;
import com.lxd.springboot.study.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * redis操作工具类.
 * 基于RedisTemplate
 * @author lxd
 * 2019年5月23日 15:52
 */
@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 读取缓存
     */
    public String get(final String key){
        String result = "";
        try {
            result = redisTemplate.opsForValue().get(key);
        } catch (Exception e){
            throw new MyException(StatusCode.EXCEPTION);
        }
        return result;
    }

    /**
     * 写入缓存
     */
    public boolean set(final String key, String value){
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key,value);
            result = true;
        } catch (Exception e){
            throw new MyException(StatusCode.EXCEPTION);
        }
        return result;
    }

    /**
     * 更新缓存
     */
    public boolean update(final String key,String value){
        boolean result = false;
        try {
            redisTemplate.opsForValue().getAndSet(key,value);
            result = true;
        } catch (Exception e){
            throw new MyException(StatusCode.EXCEPTION);
        }
        return result;
    }

    /**
     * 删除缓存
     */
    public boolean delete(final String key){
        boolean result = false;
        try {
            redisTemplate.delete(key);
            result = true;
        } catch (Exception e){
            throw new MyException(StatusCode.EXCEPTION);
        }
        return result;
    }
}
