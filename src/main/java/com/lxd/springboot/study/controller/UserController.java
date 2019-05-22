package com.lxd.springboot.study.controller;

import com.lxd.springboot.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public String findNameById(@RequestParam("id") String id){
        System.out.println("id = " + id);
        String result = userService.findUserName(id);
        System.out.println("result = " + result);
        return result;
    }
}
