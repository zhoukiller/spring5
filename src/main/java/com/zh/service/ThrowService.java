package com.zh.service;

import org.springframework.stereotype.Component;

@Component
public class ThrowService {

    public void throwException() throws Throwable {
        System.out.println("抛出异常");
        throw new NullPointerException();
//        throw new Throwable();
    }
}
