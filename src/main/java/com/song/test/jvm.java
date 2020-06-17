package com.song.test;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class jvm {

    public static void unsafe(){
        final int _1MB = 1024 * 1024;


    }

    public static void main(String[] args) throws Exception{
//        final int _1MB = 1024 * 1024;
//        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
//        unsafeField.setAccessible(true);
//        Unsafe unsafe = (Unsafe)unsafeField.get(null);
//        while (true){
//            unsafe.allocateMemory(_1MB);
//        }
        int i = 1 << 30;
        System.out.printf("===="+i);

    }
}
