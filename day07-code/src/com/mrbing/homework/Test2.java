package com.mrbing.homework;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge() == 0 ? o1.getName().compareTo(o2.getName()) : o1.getAge() - o2.getAge();
            }
        });
        ts.add(new Student("zhangsan",24));
        ts.add(new Student("lisi",18));
        ts.add(new Student("wangwu",24));
        ts.add(new Student("wangwu",24));
        ts.add(new Student("chenglong",58));
        System.out.println(ts);
        //遍历集合
        for (Student t : ts) {
            System.out.println(t);
        }



    }
}
