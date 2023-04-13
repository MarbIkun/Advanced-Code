package com.itheima.ploydemo1;

public class Teacher extends People{
    String name = "老师名字";
    @Override
    public void run(){
        System.out.println("老师跑的飞快");
    }
    public void teach(){
        System.out.println("教学");
    }
}
