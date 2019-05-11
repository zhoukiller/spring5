package com.zh;

import com.zh.service.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zh.service.ProviderService;

public class TestAOP {
    @Test
    public void m1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 如果不是spring容器管理的bean，那么织入行为不会生效
//        ProviderService providerService = new ProviderService();
//        providerService.add();

        ProviderService service = ctx.getBean("providerService", ProviderService.class);
//        service.add();
        service.add("张三");
        service.add(5);
        service.add("张三", 4);
        service.add(4, "张三");
        service.test("李四");
        service.getName("李四");
    }

    @Test
    public void m2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProviderService service = ctx.getBean("providerService", ProviderService.class);
        service.add();
        service.add("牛奶");
    }

    @Test
    public void m3() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService service = ctx.getBean("helloService", HelloService.class);
        service.msg();
    }

    @Test
    public void m4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloService service = ctx.getBean("helloService", HelloService.class);
        service.exe();
    }
}
