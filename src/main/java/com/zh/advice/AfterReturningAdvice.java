package com.zh.advice;

import org.aspectj.lang.JoinPoint;

public class AfterReturningAdvice {

    public void afterReturning(Integer num) {
        System.out.println("轻轻地，我走了...");
        System.out.println("返回值：" + num);
    }
}
