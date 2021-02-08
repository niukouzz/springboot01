package com.song.test;

import com.song.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Proxy;

public class Async {
    @Autowired
    private Service service;
    public void A(){
        System.out.println("111111111");
        service.send();
        System.out.println("222222222");
    }

    public static void main(String[] args) {
//        Proxy.newProxyInstance()
//        A();
    }
}
