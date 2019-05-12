package com.zh.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(1)
//@Aspect
@Component
public class AfterAdvice {

//    @After("execution(* com..*.*(..))")
    public void after() {
        System.out.println("after");
    }
}
