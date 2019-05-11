package com.zh.service;

import java.lang.invoke.StringConcatException;

public class ProviderService {
    public void add() {
        System.out.println("我提供了一个供应商");
    }
    public void add(String name){
        System.out.println("1. 添加了" + name);
    }
    public void add(Integer nums){
        System.out.println("1. 添加了" + nums + "个");
    }
    public void add(String name, Integer nums){
        System.out.println("1.添加了" + name + " " + nums + "个");
    }
    public void add(Integer nums, String name){
        System.out.println("2.添加了" + name + " " + nums + "个");
    }

    public void test(String name){
        System.out.println("2. 添加了" + name);
    }
    public String getName(String name) throws IllegalStateException, NullPointerException, NumberFormatException{
        System.out.println("3. 添加了" + name);
        if (name == null) {
            throw new NullPointerException("null");
        }
        if (name == "") {
            throw new IllegalStateException("null");
        }
        if (name == "1") {
            throw new NumberFormatException("null");
        }
        return name;
    }
}
