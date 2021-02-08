package com.song.test;

import lombok.Data;

/**
 * @author King
 * @description 链表头部插入数据
 * @date 2021/2/1
 **/
@Data
public class Node {
    private Object item;
    private Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public static void main(String[] args) {
//        Node header = new Node(new Object(), null);
//        Node newNode = new Node(new Object(), null);
//        header.next = newNode;
//        //头部插入数据
//        Node newNode2 = new Node(new Object(), header);
//        header = newNode2;
        int i = 9 & 8;
        System.out.println(i);
        Integer.numberOfLeadingZeros(9);
    }
}
