package com.zh;

import com.HelloBaby;
import com.zh.service.BadBaby;
import com.zh.service.ThrowService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBaby helloBaby = ctx.getBean("helloBaby", HelloBaby.class);
        helloBaby.show();
        HelloGoodBaby baby = ctx.getBean("helloGoodBaby", HelloGoodBaby.class);
        baby.show();
        BadBaby badBaby = ctx.getBean("badBaby", BadBaby.class);
        badBaby.show();
    }

    @Test
    public void m2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ThrowService throwService = ctx.getBean("throwService", ThrowService.class);
        try {
            throwService.throwException();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        HelloBaby helloBaby = ctx.getBean("helloBaby", HelloBaby.class);
        helloBaby.show();
    }

    @Test
    public void m3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloBaby helloBaby = ctx.getBean("helloBaby", HelloBaby.class);
        helloBaby.show();
    }
}
