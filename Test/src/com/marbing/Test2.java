package com.marbing;

import java.util.Arrays;

public class Test2 {
    //使用二分查找,在数组中找到给定的数
    public static void main(String[] args) {
        int[] arr = {22, 45, 87, 15, 95, 30, 47, 24, 35, 44};
        //先对数组进行排序
        show(arr);
        int num = 45;
        System.out.println(get(arr, num));

    }

    //数组排序
    public static void show(int[] arr) {
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

    public static int get(int[] arr, int num) {
        //使用二分查找
        //定义两个变量,记录数组最大和最小索引
        int max = arr.length - 1;
        int min = 0;
        //循环条件min <= max
        while (min <= max) {
            //定义变量,记录数组的中间元素
            int mid = (max + min) / 2;
            if (num > arr[mid]) {
                min = mid + 1;
            } else if (num < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
