package com.itheima.homework;

import java.util.Arrays;

public class Test2 {
    //先使数组元素变得有序,再使用二分查找
    public static void main(String[] args) {
        int[] arr = {55, 33, 44, 11, 22};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int num = 33;
        System.out.println(get(arr, num));
    }

    public static int get(int[] arr, int num) {
        int max = arr.length - 1;
        int min = 0;

        while (min <= max) {
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
