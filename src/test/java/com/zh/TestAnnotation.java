package com.zh;

import com.zh.service.UserService;
import com.zh.service.hello.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContex.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        userService.eat();
    }

    @Test
    public void m2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContex.xml");
        HelloWorld helloWorld = ctx.getBean("helloWorld", HelloWorld.class);
        helloWorld.hello();
    }
}
