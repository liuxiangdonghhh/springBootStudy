package com.lxd.springboot.study.service;

import com.lxd.springboot.study.annotation.OperationLogDetail;
import com.lxd.springboot.study.enums.OperationType;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //public String findUserName(String id);
    @OperationLogDetail(detail = "INFO",level = 3,operationType = OperationType.SELECT)
    public String findUserName(String id) {
        System.out.println("sevice id = " + id);
        return id;
    }
}
