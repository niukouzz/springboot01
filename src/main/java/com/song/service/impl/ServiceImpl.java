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
}
