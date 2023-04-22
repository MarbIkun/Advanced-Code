package com.itheima.sort;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 4, 5, 8};
      //外层循环:控制循环几轮,确定有几个当前位置
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环:控制当前位置元素和后面的元素比较的次数
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
