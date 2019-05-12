package com.zh.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(2)
//@Aspect
@Component
public class AroundAdvice2 {
//    @Around("execution(* com..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable{
            Object proceed = joinPoint.proceed();
            System.out.println("around2");
            return proceed;
    }

//    @Around("execution(* com..*.*(..))")
    public Object aroundCatch(ProceedingJoinPoint joinPoint){

        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
            System.out.println("aroundCatch2");
        }catch (RuntimeException ex) {
//            throw ex;
            System.out.println( "AroundService2 " + "RuntimeExceptionBegin");
            ex.printStackTrace();
            System.out.println("AroundService2 " + "RuntimeExceptionEnd");
        }
        catch (Throwable throwable) {
//            throw throwable;
            System.out.println("AroundService2 " + "ThrowableBegin");
            throwable.printStackTrace();
            System.out.println("AroundService2 " + "ThrowableEnd");
        }finally {
            System.out.println("异常2处理结束");
            return proceed;
        }
    }
}
