package com.mrbing.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 18));
        list.add(new Student("李四", 21));
        list.add(new Student("王五", 25));
        System.out.println(list);

        System.out.println("--------迭代器---------");
        //迭代器遍历
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student next = it.next();
            System.out.println(next);
        }
        System.out.println("--------for循环--------");
        //for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------增强for----------");
        //增强for
        for (Student stu : list) {
            System.out.println(stu);
        }

        System.out.println("------Lambda表达式--------");
        //Lambda表达式
        list.forEach(System.out::println);
    }
}
