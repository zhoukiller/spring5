package com.zh.advice;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class ThrowAdvice2 {
    @AfterThrowing("execution(* com..*.*(..)) throws Throwable")
    public void Throw() {
        System.out.println("发现异常2" + " Throwable");
    }
}
