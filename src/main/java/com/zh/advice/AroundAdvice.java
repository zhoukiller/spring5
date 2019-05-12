package com.zh.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class AroundAdvice {
//    @Around("execution(* com..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable, RuntimeException{

        System.out.println("aroundbefore");
        Object proceed = joinPoint.proceed();
        System.out.println("aroundafter");
        return proceed;
    }

    @Around("execution(* com..*.*(..))")
    public Object aroundCatch(ProceedingJoinPoint joinPoint){

        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
            System.out.println("aroundCatch");
        }catch (RuntimeException ex) {
//            throw ex;
            System.out.println( "AroundService " + "RuntimeExceptionBegin");
            ex.printStackTrace();
            System.out.println("AroundService " + "RuntimeExceptionEnd");
        }
        catch (Throwable throwable) {
//            throw throwable;
            System.out.println("AroundService " + "ThrowableBegin");
            throwable.printStackTrace();
            System.out.println("AroundService " + "ThrowableEnd");
        }finally {
            System.out.println("异常处理1结束");
            return proceed;
        }
    }
}
