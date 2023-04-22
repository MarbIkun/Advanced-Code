package com.mrbing.homework;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String s, int i, String s1) {
    }


    @Override
    public String toString() {
        return "学生{" +
                "姓名:'" + name + '\'' +
                ", 年龄:" + age +
                '}';
    }
}
