package com.mrbing.staticdemo1;

public class Test {
    public static void main(String[] args) {
        System.out.println(Student.list);
        //每创建一次对象,就会执行一次实例代码块
        Student s1 = new Student(2);//此处调用有参构造器
        //每创建一次对象,就会执行一次实例代码块
        Student s2 = new Student();//此处调用无参参构造器
        System.out.println(s1.count);//2
        System.out.println(s2.count);//100
    }
}
