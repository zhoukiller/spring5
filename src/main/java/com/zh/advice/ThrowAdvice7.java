package com.zh.advice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(7)
//@Aspect
@Component
public class ThrowAdvice7 {

//    @AfterThrowing("execution(* com..*.*(..) throws Throwable, RuntimeException)")
    public void Throw() {
        System.out.println("发现异常7"  + " Throwable"  + " RuntimeException");
    }
}
