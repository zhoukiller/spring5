package com.zh;

import com.zh.pojo.Car;
import com.zh.pojo.Dog;
import com.zh.pojo.Girl;
import com.zh.pojo.PrettyGirl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void m1() {
        // 获取应用程序上下文对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContex.xml");
        Girl g = (Girl) ctx.getBean("girl");
        System.out.println(g);
//        ((PrettyGirl)g).show();
    }

    @Test
    public void m2() {
        // 传入都给spring配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{"beans1.xml", "beans2.xml"}
        );
        // 由于指定了class不需要强转
        Girl g2 = ctx.getBean("girl2", Girl.class);
        Girl g3 = ctx.getBean("hisGirl", Girl.class);
        System.out.println(g2.getName());
    }

    @Test
    public void m3() {
        // 传入都给spring配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{"beans1.xml", "beans2.xml"}
        );
        // 由于指定了class不需要强转
        Girl g2 = ctx.getBean("girl2", Girl.class);
        Girl g3 = ctx.getBean("hisGirl", Girl.class);
        System.out.println(g2.getName());
//        ((ClassPathXmlApplicationContext)ctx).destroy(); 过时的
    }

    @Test
    public void m4() {
        // 传入都给spring配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{"beans1.xml", "beans2.xml"}
        );
        // 单例模式
        Girl g = ctx.getBean("g", Girl.class);
        Girl g2 = ctx.getBean("g2", Girl.class);
        Girl g3 = ctx.getBean("g3", Girl.class);
        System.out.println(g);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g2 == g3);

    }

    @Test
    public void m5() {
        // 传入都给spring配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{"beans3.xml"}
        );
    }
    @Test
    public void m6() {
        // 传入都给spring配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{"beans3.xml"}
        );
        Girl g = ctx.getBean("girl", Girl.class);
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog.getName());
        Girl girl = ctx.getBean(Girl.class);
        System.out.println(girl.getDog().getName());
    }

    @Test
    public void m7() {
        // 传入都给spring配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{"beans3.xml"}
        );

//        只有一个Dog bean才能获取
        Dog dog = ctx.getBean("dog2", Dog.class);
        System.out.println(dog.getName());
    }

    @Test
    public void m8() {
        // 传入都给spring配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{"beans3.xml"}
        );

//        只有一个Dog bean才能获取
        Car car = ctx.getBean("car", Car.class);
        Car car3 = ctx.getBean("car3", Car.class);
        System.out.println(car3);
    }
}
