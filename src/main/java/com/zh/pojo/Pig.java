package com.zh.pojo;

public class Pig {
    private String name;

    private Integer sleep;

    private String taste;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSleep() {
        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", sleep=" + sleep +
                ", taste='" + taste + '\'' +
                '}';
    }
}
