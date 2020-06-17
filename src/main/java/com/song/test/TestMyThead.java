package com.song.test;

/**
 * 测试同步代码
 */
public class TestMyThead {

    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA threadA = new ThreadA(list);
        threadA.start();


        ThreadB threadB = new ThreadB(list);
        threadB.start();

        /*threadA.join();
        threadB.join();*/

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        list.priList();

    }

}

class ThreadA extends Thread{
    private MyList list;

    public ThreadA(){}
    public ThreadA(MyList list) {
        this.list = list;
    }

    public void run(){
        list.add("C");
    }
}

class ThreadB extends Thread{
    private MyList list;

    public ThreadB(){}
    public ThreadB(MyList list) {
        this.list = list;
    }

    public void run(){
        list.add("D");
    }
}

class MyList{

    private String[] str= {"A","B","","",""};

    private int index=2;

    public synchronized void add(String s){
        str[index] = s;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=========="+s);
        index++;
    }

    public void priList(){
        System.out.println("数组中有效元素的个数:"+index);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]+"  ");
        }
    }

}


