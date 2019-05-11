package com.zh;

import com.zh.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        People people = ctx.getBean("people", People.class);
        System.out.println(people);
        System.out.println(people.getFriends().length);
    }
}
