package com.song.test;

import lombok.Data;

@Data
public abstract class AbstractCar {

    private String color;
    private String brand;
    private String name;
    public abstract void getMessage();
    public void getMessage1(){

    }
}
