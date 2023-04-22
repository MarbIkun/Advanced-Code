package com.mrbing.stream;

import java.util.*;
import java.util.stream.Collectors;

//Stream流常见终结方法
public class Test04Stream {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 需求1：请计算出身高超过168的学生有几人。
        System.out.println(students.stream().filter(s -> s.getHeight() > 168).count());
        // 需求2：请找出身高最高的学生对象，并输出.get()。
        System.out.println(students.stream().max((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())));
        // 需求3：请找出身高最矮的学生对象，并输出。
        System.out.println(students.stream().min((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())));
        // 需求4：请找出身高超过170的学生对象，并放到一个新List\Set集合、数组中去返回。
        // 注意：流只能收集一次。
        System.out.println(students.stream().filter(s -> s.getHeight() > 170).collect(Collectors.toList()));
        System.out.println(students.stream().filter(s -> s.getHeight() > 170).collect(Collectors.toSet()));
        System.out.println(Arrays.toString(students.stream().filter(s -> s.getHeight() > 170).toArray()));
        // 需求5：请找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Map集合返回。注意：toMap方法不能帮我们自动去重，需先distinct()
        System.out.println(students.stream().filter(s -> s.getHeight() > 170).distinct().collect(Collectors.toMap(s -> s.getName(), s -> s.getHeight())));
    }
}
