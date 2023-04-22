package com.itheima.system;

public class HomeWork1 {
    public static void main(String[] args) {
        judgement("123321");
    }

    public static void judgement(String str) {
        //判断传入的字符串是否为空
        if (str != null) {
            StringBuilder sb = new StringBuilder(str);
            if ((sb.toString().equals(sb.reverse().toString()))) {
                System.out.println("对称");
            } else {
                System.out.println("不对称");
            }
        }else {
            System.out.println("传入的数字为空");
        }
    }
}