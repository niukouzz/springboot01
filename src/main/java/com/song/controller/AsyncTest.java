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
    private Service serviceImpl;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ModelAndView testController(){
        ModelAndView modelAndView = new ModelAndView("view");
        serviceImpl.send();
        modelAndView.addObject("name","I Am Boomking");
        //888888
        return modelAndView;
    }
}
