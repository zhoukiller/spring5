package com.zh.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(11)
//@Aspect
@Component
public class AfterReturningAdvice2 {
//    @AfterReturning("execution(* com..*.*(..))")
    public void returning(){
        System.out.println("return2");
    }
}
