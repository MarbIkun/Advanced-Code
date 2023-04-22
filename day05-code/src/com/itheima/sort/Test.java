package com.itheima.sort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] arr = {6,2,9,4,5,8};
//外层循环:控制冒泡排序总共比较多少轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内存循环;控制每一轮比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
