package com.zh.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order(1)
//@Aspect
@Component  //定义为组件，在spring中注册
public class BeforeAdvice {

    // com子包下的类的方法，不包括com子包的子包下的类的方法
//    @Before("execution(* com.*.*.*(..))")
    // com包及任意级别子包的类的方法
//    @Before("execution(* com..*.*(..))")
    public void before() {
        System.out.println("before");
    }

}
