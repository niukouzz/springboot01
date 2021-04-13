package com.song.test;

public class AodiCar extends AbstractCar {

    @Override
    public void getMessage() {
        this.setName("奥迪");
        this.setColor("黑色");
        this.setBrand("aodi");
        System.out.println("i'm baojun"+this.getName());
    }
}
