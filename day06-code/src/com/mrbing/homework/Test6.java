package com.mrbing.homework;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        String[] arr = "张三,18,西安".split("");
        Student stu = new Student(arr[0],Integer.parseInt(arr[1]),arr[2]);
        System.out.println(stu);




class Student {
            private String name;
            private int age;
            private String address;

            public Student(String name, int age, String address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }

            public String tostring() {
                return "Student{" +
                        "name='" + name + '\'' +
                        "age=" + age +
                        "address='" + address + '\'' + '}';

            }
        }
    }
}