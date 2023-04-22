package com.itheima.homework;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {55, 33, 44, 11, 22};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

