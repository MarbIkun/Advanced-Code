package com.marbing;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //将字符串转成整数
        String s = "10,50,30,20,40";
        String[] split = s.split(",");
        int[] arr = new int[split.length];
        //再将整数传入数组
        System.out.println(Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        //冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}

