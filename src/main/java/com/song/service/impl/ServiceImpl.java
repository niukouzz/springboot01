package com.song.service.impl;

import com.song.service.Service;
import org.springframework.scheduling.annotation.Async;

/**
 * @author SCHS
 * @title: ServiceImpl
 * @projectName springboot01
 * @description: TODO
 * @date 2019/7/2616:17
 */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Async
    @Override
    public void send() {
        System.out.println("keyi");
    }

    @Async
    public void JobOne()  {
        System.out.println("开始执行任务一");
        long l1 = System.currentTimeMillis();
//        Thread.sleep(2000);
        long l2 = System.currentTimeMillis();
        System.out.println("任务一用时"+(l2-l1));

    }

    @Async
    public void JobTwo()   {
        System.out.println("开始执行任务二");
        long l1 = System.currentTimeMillis();
//        Thread.sleep(2000);
        long l2 = System.currentTimeMillis();
        System.out.println("任务二用时"+(l2-l1));
    }
    @Async
    public void JobThree()   {
        System.out.println("开始执行任务三");
        long l1 = System.currentTimeMillis();
//        Thread.sleep(2000);
        long l2 = System.currentTimeMillis();
        System.out.println("任务三用时"+(l2-l1));
    }


}
