package com.mrbing.stream;

import java.util.*;
import java.util.stream.Stream;

//Stream流常见中间方法
public class Test03Stream {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(88.5);
        scores.add(100.0);
        scores.add(60.0);
        scores.add(99.0);
        scores.add(9.5);
        scores.add(99.6);
        scores.add(25.0);
        // 需求1：找出成绩大于等于60分的数据，并升序后，再输出。
        //scores.stream().filter()
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 需求2：找出年龄大于等于23,且年龄小于等于30岁的学生，并按照年龄降序输出.
        students.stream().filter(student -> student.getAge() >= 23).filter(student -> student.getAge() <= 30).sorted((o1, o2) -> o2.getAge() - o1.getAge()).forEach(System.out::println);
        // 需求3：取出身高最高的前3名学生，并输出。
        System.out.println("-----------------------------------");
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())).limit(3).forEach(System.out::println);
        // 需求4：取出身高倒数的2名学生，并输出。
        System.out.println("-------------------------------------");
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())).skip(students.size() - 2).forEach(System.out::println);
        // 需求5：找出身高超过168的学生叫什么名字，要求去除重复的名字，再输出。
        System.out.println("-----------------------");
        students.stream().filter(student -> student.getHeight() >= 168).map(student -> student.getName()).forEach(System.out::println);
        // 注意：distinct去重复，自定义类型的对象（如希望内容一样就认为重复，需重写hashCode,equals）
        System.out.println("------------------------");
        students.stream().distinct().forEach(System.out::println);
        // 需求6：合并两个流
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("123");
        list1.add("234");
        list1.add("345");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("987");
        list2.add("876");
        list2.add("765");




    }
}
