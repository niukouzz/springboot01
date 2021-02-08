package com.song.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author King
 * @description api
 * @date 2020/9/8
 **/
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
            threadLocal.set(i);
            final int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("========线程："+index);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
