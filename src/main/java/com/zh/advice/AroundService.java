package com.zh.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundService {
    public Object around(ProceedingJoinPoint pjp) {
        try {
            System.out.println("环绕地球80天");
            Object proceed = pjp.proceed();
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }
}
