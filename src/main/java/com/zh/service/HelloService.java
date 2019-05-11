package com.zh.service;

public class HelloService {
    public String msg() {
        System.out.println("我是msg");
        return "王祖贤";
    }

    public void exe(){
        System.out.println("执行exe");
        throw new RuntimeException("故意的");
    }
}
