package com.zh.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(1)
//@Aspect
@Component
public class AfterReturningAdvice {

//    @AfterReturning("execution(* com..*.*(..))")
    public void returning(){
        System.out.println("return");
    }
}
