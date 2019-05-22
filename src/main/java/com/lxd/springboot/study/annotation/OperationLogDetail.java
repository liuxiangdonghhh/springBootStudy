package com.lxd.springboot.study.annotation;

import com.lxd.springboot.study.enums.OperationType;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationLogDetail {

    String detail() default "";

    int level() default 0;

    OperationType operationType() default OperationType.UNKNOWN;

}
