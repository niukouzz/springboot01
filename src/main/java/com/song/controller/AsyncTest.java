package com.song.controller;

import com.song.service.Service;
import com.song.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author SCHS
 * @title: AsyncTest
 * @projectName springboot01
 * @description: TODO
 * @date 2019/7/2616:13
 */
@RestController
public class AsyncTest {

    @Autowired
    private Service myService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ModelAndView testController(){
        ModelAndView modelAndView = new ModelAndView("view");
        System.out.println("开始访问");
        long l1 = System.currentTimeMillis();
        myService.JobOne();
        myService.JobTwo();
        myService.JobThree();
        long l2 = System.currentTimeMillis();

        System.out.println("结束访问,用时"+(l2-l1));
//        System.out.println("111111111");
//        myService.send();
//        System.out.println("222222222");


        modelAndView.addObject("name","I Am Boomking");
        //yyuioyuio
        //888888
        return modelAndView;
    }
}
