package com.zh.pojo;

public class Car {
    private String name;

    private Double price;

    private Double speed;

    public Car(String name, Double price, Double speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Car(Double price, Double speed) {
        this.price = price;
        this.speed = speed;
    }






    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
