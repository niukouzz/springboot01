package com.song.test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReadWriteLock {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Object> copy = new CopyOnWriteArrayList<>();
        ConcurrentLinkedQueue<Object> queue = new ConcurrentLinkedQueue<>();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    }
}

class MyLock{
    private Object[] obj = new Object[5];
    private int index;
    private ReadWriteLock rrw= new ReentrantReadWriteLock();
    private Lock rl = rrw.readLock();
    private Lock wl = rrw.writeLock();

    //写操作
    public void add(Object o){
        wl.lock();
        try {
            obj[index] = o;
            index++;
        } finally {
            wl.unlock();
        }
    }

    //读操作
    public int size(){
        rl.lock();
        try {
            return index;
        } finally {
            rl.unlock();
        }
    }

    //写操作
    public void remove(){

    }

    //


}
