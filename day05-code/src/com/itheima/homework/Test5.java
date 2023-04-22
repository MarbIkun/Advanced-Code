package com.itheima.homework;

public class Test5 {
    public static void main(String[] args) {
        Inter inter = (a,b) -> a / b;
        System.out.println(inter.dicide(10, 4));
    }
}
interface Inter{
    int dicide(int a,int b);
}
