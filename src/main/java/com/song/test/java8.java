package com.song.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.SpringCglibInfo;
import org.springframework.cglib.beans.BeanGenerator;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author SCHS
 * @title: java8
 * @projectName springboot01
 * @description: TODO
 * @date 2019/9/1815:52
 */
@Slf4j
public class java8 {

    //并发包
    private static void longAddrTest(){
        LongAdder longAdder= new LongAdder();
        longAdder.increment();//+1
        longAdder.decrement();//-1
        longAdder.add(10L);//增加一个值（非原子操作）
        //内部多个变量a1,a2,a3......
        LongAccumulator longAccumulator=new LongAccumulator(
                //提供一个函数（非原子操作）
                (a,v)->{return a+v;},
                //初始值
                0
        );
        //每次调用，其中一个变量an->(an,10);
        longAccumulator.accumulate(10);
        //get方法会统计所有的变量，输出a1 op a2 op a3 op......
        //long p = longAccumulator.accumulate();
        long l = longAccumulator.get();
        log.info("get方法会统计所有的变量，输出a1 op a2 op a3 op......{}",l);
    }

    //时间API
    private static void localDate(){
        LocalDate now = LocalDate.now();
        LocalTime time = LocalTime.now();
        log.info("当前日期时分秒：{} {}",now,time);
        log.info("日：{},月：{}",now.getDayOfMonth(),now.getMonth().getValue());
        log.info("时间：{}",now.atTime(time));
    }

    //校验String类型为空
    public static void optional(){

        int o = 1;
        String i = "string";

        Optional<Integer> o1 = Optional.of(o);
        Integer integer = o1.get();
        o1.notify();
        log.info("值：{}",integer);
    }

    //lambda表达式
    public static void lambdaTest(){
        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");

        list.add("ee");

        Arrays.asList("a","b","c","d","e").forEach(g -> { System.out.println(g); });

    }

    public static void lambdaMap(){
        List<Integer> list = new ArrayList<>();
        // 循环遍历Map的4中方法
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 2);
        map.put(3, 4);
        // 1. entrySet遍历，在键和值都需要时使用（最常用）
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
            //list.add()
        }
    }

    public static void cglibTest() throws Exception {

        HashMap<String, Class<?>> map = new HashMap<>();
        map.put("id",Class.forName("java.lang.Integer"));
        map.put("name", Class.forName("java.lang.String"));
        map.put("address", Class.forName("java.lang.String"));
        BeanGenerator beanGenerator = new BeanGenerator();

        //SpringCglibInfo springCglibInfo = new SpringCglibInfo();


    }

    public static void main(String[] args) {
        lambdaMap();
    }


}
