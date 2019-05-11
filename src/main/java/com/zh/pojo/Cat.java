package com.zh.pojo;

public class Cat {
    private String skin;

    private Integer leg;

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Integer getLeg() {
        return leg;
    }

    public void setLeg(Integer leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "skin='" + skin + '\'' +
                ", leg=" + leg +
                '}';
    }
}
