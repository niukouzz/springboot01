package com.song.test;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class kaoshi {
//    private static kaoshi instance = new kaoshi();
//    private static int count = 1;
//
//    public kaoshi() {
//        System.out.println(count);
//    }
//    public static kaoshi getInstance(){
//        return instance;
//    }
//
//    public static void main(String[] args) {
//        kaoshi.getInstance();
//    }


//    public static void main(String[] args) {
//        ArrayList<Long> list = new ArrayList<>();
//        list.add(null);
//        list.add(1l);
//        long sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//
//        }
//        System.out.println(sum);
//    }

    private static volatile int s = 0;
    private static final ThreadPoolExecutor async = new ThreadPoolExecutor(
            0, Integer.MAX_VALUE,
            60L, TimeUnit.SECONDS, new SynchronousQueue<>());
    public static void main(String[] args) throws InterruptedException {
//        final StringBuffer append = new StringBuffer().append("1");
//        append.append("2");
//        System.out.println(append.toString());
        for (int i = 0; i < 10000; i++) {
            async.execute(()-> s++);
        }
        Thread.sleep(5000L);
        System.out.println(s);

    }
}
