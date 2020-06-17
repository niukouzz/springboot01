package com.song.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class thread {

    public static void main(String[] args) throws InterruptedException {
        log.info("============main start ============");
        Thread thread = new Thread(new MyThread());
        Thread thread1 = new Thread(new MyThread1());
        thread.start();
        thread.join();
        thread1.start();

        log.info("============main end ============");
    }

}

@Slf4j
class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            log.info("--------"+i);
        }
    }
}

@Slf4j
class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            log.info("**********"+i);
        }
    }
}
