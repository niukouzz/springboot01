package com.song.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Teststack {
    public static void main(String[] args) {
        //Mystack ms = new Mystack();
        //多态：接口类型的引用指向一个对象
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

//        ms.push("A");
//        ms.push("B");
//        ms.push("C");
//        ms.push("D");
//        ms.pop();
//        ms.pop();
//        ms.pop();
//        ms.pop();
        Productor p = new Productor(queue);
        Consumer c = new Consumer(queue);
//        p.start();
//        c.start();



//      线程池来启动创建线程......
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(p);
        pool.submit(c);
        pool.shutdown();

    }


}

//线程：存储元素-----生产者
class Productor extends Thread{
    private BlockingQueue<String> queue;
    public Productor() {

    }
    public Productor(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    public void run(){
        for (char c= 'A';c<='Z';c++) {
            try {
                queue.put(c + "");
                System.out.println(c+"入队.....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//线程：取元素
class Consumer extends Thread{
    private BlockingQueue<String> queue;
    public Consumer() {

    }
    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    public void run(){
        for (int i = 0; i < 26; i++) {
            try {
                String s = queue.take();
                System.out.println(s+"出队.....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*class Mystack{
    private String[] s = new String[5];
    private int index;

    public synchronized void push(String str){
        //当存储空间满的时候，则生产者需要等待
        while (index == str.length()){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        s[index]=str;
        System.out.println(str+"入栈=========="+index);
        index++;
        this.notifyAll();//通知消费者从等待的状态结束.....
    }

    public synchronized void pop(){
        //当存储空间空的时候，则消费者需要等待.....
        while (index == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        index--;
        System.out.println(s[index]+"出栈-----------"+index);
        s[index]=null;
        this.notifyAll();//通知生产者从等待状态结束...
    }
}*/
