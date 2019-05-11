package com.zh;

import com.zh.pojo.Pig;
import com.zh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWired {
    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowired.xml");
        User user = ctx.getBean("user", User.class);
        Pig pig = ctx.getBean("pig", Pig.class);
        System.out.println(pig == user.getPig());
        System.out.println(user.getPig().getName());
    }
}
