package com.itheima.homework;

public class Student implements Comparable<Student>{
    private String name;
    private int yuWen;
    private int age;
    private int yingYu;

    @Override
    public int compareTo(Student o) {
        if (this.getYuWen() - o.getYuWen() != 0){
            return this.getYuWen() - o.getYuWen();
        }else {
            return o.getYingYu() - this.getYingYu();
        }

        }
    public String toString() {
        return "Student{姓名:" + name + ", 语文成绩:" + yuWen + ", 年龄:" + age + ",英语成绩: " + yingYu + "}";
    }

    public Student() {
    }

    public Student(String name, int yuWen, int age, int yingYu) {
        this.name = name;
        this.yuWen = yuWen;
        this.age = age;
        this.yingYu = yingYu;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getYuWen() {
        return yuWen;
    }

    public void setYuWen(int yuWen) {
        this.yuWen = yuWen;
    }

    public int getYingYu() {
        return yingYu;
    }

    public void setYingYu(int yingYu) {
        this.yingYu = yingYu;
    }

}
