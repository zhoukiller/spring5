package com.zh.service.hello;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class HelloWorld {
    public void hello() {
        System.out.println("嘿!");
    }
}
