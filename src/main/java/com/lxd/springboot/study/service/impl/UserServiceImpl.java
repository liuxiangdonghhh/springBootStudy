/*package com.lxd.springboot.study.service.impl;

import com.lxd.springboot.study.annotation.OperationLogDetail;
import com.lxd.springboot.study.enums.OperationType;
import com.lxd.springboot.study.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @OperationLogDetail(detail = "INFO",level = 3,operationType = OperationType.SELECT)
    public String findUserName(String id) {
        System.out.println(this);
        System.out.println("sevice id = " + id);
        return id;
    }
}*/
