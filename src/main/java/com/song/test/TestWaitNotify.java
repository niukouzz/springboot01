package com.song.test;

/**
 *
 */
public class TestWaitNotify {
    public static void main(String[] args) {

        Object o = new Object();
        Thread3 thread3 = new Thread3(o);
        thread3.start();

        synchronized (o) {
            try {
                System.out.println("~~~~~~~~~main start~~~~~~~~~~~~");
                o.wait();
                System.out.println("~~~~~~~~~main end~~~~~~~~~~~~");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }



    }





}
class Thread3 extends Thread{
    private Object o;

    public Thread3() {

    }
    public Thread3(Object o) {
        this.o = o;
    }

    public void run(){
        synchronized (o) {
            for (int i = 0; i <20; i++) {
                System.out.println("~~~~~~~~~~~"+i);
                o.notifyAll();
            }

        }
    }
}
