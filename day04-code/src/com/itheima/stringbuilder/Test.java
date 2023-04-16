package com.itheima.stringbuilder;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        System.out.println(get(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static String get(int[] arr) {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i] + ", ");
        }
        sb.append(arr[arr.length - 1] + "]");

        return sb.toString();
    }
}
