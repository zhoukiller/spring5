package com.zh.advice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(6)
//@Aspect
@Component
public class ThrowAdvice6 {

//    @AfterThrowing("execution(* com..*.*(..) throws RuntimeException)")
    public void Throw() {
        System.out.println("发现异常6"  + " RuntimeException");
    }
}
