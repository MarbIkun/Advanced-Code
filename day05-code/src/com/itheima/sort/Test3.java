package com.itheima.sort;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88};
        int num = 55;
        int index = search(arr, num);
        System.out.println(index);


        int i = Arrays.binarySearch(arr, num);
        System.out.println(i);

    }

    public static int search(int[] arr, int num) {
        //定义两个变量,分别记录最大和最小索引
        int max = arr.length - 1;
        int min = 0;
        //循环: min <= max
        while (min <= max) {
            //计算出中间索引mid
            int mid = (max + min) / 2;
            //正式查找
            if (num > arr[mid]) {
                min = mid + 1;//在数组右边,修改min的值
            } else if (num < arr[mid]) {
                max = mid - 1;//在左边,修改max的值
            }else {//相等,返回查找元素的索引
                return mid;
            }
        }
        //元素不存在
        return -1;
    }
}
