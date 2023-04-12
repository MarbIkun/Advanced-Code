package com.mrbing.staticdemo1;

import java.util.ArrayList;

public class Student {
    static ArrayList<String>list;
    int count;

    //静态代码块:随着类的加载会执行一次
    static {
         list = new ArrayList<>();
         list.add("a");
         list.add("b");
         list.add("c");
    }
    //实例代码块:每创建一次对象,就会执行一次实例代码块
    {
        count = 100;
        System.out.println("实例代码块");
    }

    public Student() {
        System.out.println("无参构造器");
    }

    public Student(int count) {
        System.out.println("有参构造器");
        this.count = count;
    }
}

