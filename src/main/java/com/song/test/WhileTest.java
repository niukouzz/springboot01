package com.song.test;

import lombok.Data;

public class WhileTest {
    private volatile boolean flag = true;
    public void setFlag(boolean flag){
        this.flag = flag;
    }
    public void say(){
        while (flag){
            System.out.println(1);
        }
        System.out.println("----------------线程停止-----------------");
    }

    public static void main(String[] args) throws InterruptedException {
        final WhileTest wt = new WhileTest();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                wt.say();
            }
        });
        t.start();
        Thread.sleep(500);
        wt.setFlag(false);
    }
}
