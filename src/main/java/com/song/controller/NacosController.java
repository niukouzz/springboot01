package com.song.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author King
 * @description api
 * @date 2020/8/25
 **/
@RestController
@RequestMapping("/com")
public class NacosController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @RequestMapping(value = "/nacos", method = RequestMethod.GET)
    public Boolean nacos (){
        System.out.println(1111);
        return useLocalCache;
    }
}
