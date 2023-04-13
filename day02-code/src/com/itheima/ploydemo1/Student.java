package com.itheima.ploydemo1;

public class Student extends People{
    String name = "学生名字";
    @Override
    public void run(){
        System.out.println("学生跑的更慢");
    }
    public void study(){
        System.out.println("学习");
    }
}
