package com.mrbing.list;

import java.util.LinkedList;

public class LinkedListTste {
    public static void main(String[] args) {
        //使用LinkedList模拟队列结构,买票场景,先进先出
        LinkedList<String> list = new LinkedList<>();
        //入队
        list.addFirst("一号买票");
        list.addFirst("二号买票");
        list.addFirst("三号买票");
        list.addFirst("四号买票");
        System.out.println(list);

        //出队
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list);

        System.out.println("-----------------------");
        //使用LinkedList模拟栈结构,子弹装入打出,先进后出
        LinkedList<String> list1 = new LinkedList<>();
        //进栈
        list1.addFirst("一号子弹");
        list1.addFirst("二号子弹");
        list1.addFirst("三号子弹");
        list1.addFirst("四号子弹");
        //出栈
        System.out.println(list1.removeFirst());
        System.out.println(list1.removeFirst());
        System.out.println(list1.removeFirst());
        System.out.println(list1);


    }
}
