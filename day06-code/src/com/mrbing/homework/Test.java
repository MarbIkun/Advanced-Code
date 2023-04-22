package com.mrbing.homework;

public class Test {
    public static void main(String[] args) {
        String[] arr = new String[3];
        method(arr);
    }

    public static void method(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
//需求：遍历打印长度为3的字符串
            if (arr[i].length() == 3) {
                System.out.println(arr[i]);
            }
        }
    }
}