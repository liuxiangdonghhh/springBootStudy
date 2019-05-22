package com.lxd.springboot.study.aop;

import com.lxd.springboot.study.annotation.OperationLogDetail;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.lxd.springboot.study.annotation.OperationLogDetail)")
    public void operationLog(){}

    @Around("operationLog()")
    public Object doAround(ProceedingJoinPoint joinPoint){
        System.out.println("方法 : doAround" );
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        OperationLogDetail annotation = signature.getMethod().getAnnotation(OperationLogDetail.class);

        Object id = null;
        try {
            id = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around id = " + id);
        System.out.println("记录日志:" + annotation.toString());

        return id;
    }

    @Before("operationLog()")
    public void doBeforeAdvice(JoinPoint joinPoint){
        System.out.println("进入方法前执行.....");
    }

    @AfterReturning(returning = "id", pointcut = "operationLog()")
    public void doAfterReturning(String id){
        System.out.println("方法的返回值 : " + id);
    }

    @AfterThrowing("operationLog()")
    public void throwss(JoinPoint jp){
        System.out.println("方法异常时执行.....");
    }

    @After("operationLog()")
    public void after(JoinPoint jp){
        System.out.println("方法最后执行.....");
    }

}
