package com.song.test;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author King
 * @description api
 * @date 2020/8/24
 **/
public class NacosPassword {
    public static void main(String[] args) {
        String encode = new BCryptPasswordEncoder().encode("123456");
        System.out.println(encode);
    }
}
