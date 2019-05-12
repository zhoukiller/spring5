package com.zh.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(11)
//@Aspect
@Component  //定义为组件，在spring中注册
public class BeforeAdvice2 {



//    @Before("execution(* com..*.*(..))")
    public void before() {
        System.out.println("before2");
    }
}
