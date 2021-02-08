package com.song.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author King
 * @description api
 * @date 2020/9/10
 **/
public class Memory {
    public static void main(String[] args) {

        /*计算某一段程序消bai耗的内存和时间*/
        Runtime r = Runtime.getRuntime();
        r.gc();//计算内存前先垃圾回收一次zhi
        long start = System.currentTimeMillis();//开始Time
        long startMem = r.freeMemory(); // 开始Memory
//        GBSort(array,1,len);//！！dao！！！被测的程序！！！！！
        Set<Integer> integers = new HashSet<>();
        long endMem =r.freeMemory(); // 末尾Memory
        long end = System.currentTimeMillis();//末尾Time
//输出
        System.out.println("TimeCost: "+String.valueOf(end - start)+"ms");
        System.out.println("MemoryCost: "+String.valueOf((startMem- endMem))+"KB");
    }
}
