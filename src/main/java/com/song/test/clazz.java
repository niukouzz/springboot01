package com.song.test;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author King
 * @description api
 * @date 2021/2/2
 **/
public class clazz {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
