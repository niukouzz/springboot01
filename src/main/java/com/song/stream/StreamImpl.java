package com.song.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author King
 * @description apip
 * @date 2021/4/12
 * url:https://blog.csdn.net/weixin_46324664/article/details/108207191
 **/
public class StreamImpl {



    private static void ArrayList() {

        ArrayList<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");
//        list.stream().filter(s ->s.startsWith("陈")).forEach(a ->{
//            System.out.println(a);
//        });
//        list.stream().skip(2).forEach(System.out::println);
        list.stream().skip(5).forEach(System.out::println);

    }
    private static void Map() {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(-3);
        list.add(-4);
        list.add(-5);
//        list.stream().forEach(a ->{
//            System.out.println(Math.abs(a));
//        });
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> collect = list1.stream().map(a -> a * a).collect(Collectors.toList());
        System.out.println(collect.toString());

    }
    public static void main(String[] args) {
//        ArrayList();
        Map();
    }

}
