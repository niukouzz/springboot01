package com.song.test;

public class BaoJun extends AbstractCar {
    @Override
    public void getMessage() {
        this.setName("宝骏");
        this.setColor("黑色");
        this.setBrand("baojun");
        System.out.println("i'm baojun"+this.getName());
    }
}
