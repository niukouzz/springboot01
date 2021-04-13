package com.song.test;

public class FactoryCar {
    public AbstractCar getCar(String name){
        if (name.equals("奥迪")) {
            return new AodiCar();
        }
        if (name.equals("宝骏")) {
            return new BaoJun();
        }
        return null;
    }

    public static void main(String[] args) {
        FactoryCar factoryCar = new FactoryCar();
        AbstractCar a = factoryCar.getCar("宝骏");
        a.getMessage();
    }
}
