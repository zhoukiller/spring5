package com.zh.advice;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * 写一个方法的前置
 * before advice
 */
public class BeforeAdvice {

    public void methodBefore() {
        System.out.println("我在方法前面执行");
    }

    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("method:" + name);
        System.out.println(Arrays.toString(args));
    }

}
