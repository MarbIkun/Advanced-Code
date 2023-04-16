package com.itheima.system;

public class Test {
    public static void main(String[] args) {
        // 1、public static void exit(int status):
//   终止当前运行的Java虚拟机。
//   该参数用作状态代码; 按照惯例，非零状态代码表示异常终止。
// 2、public static long currentTimeMillis():
//    获取当前系统的时间
//    返回的是long类型的时间毫秒值：指的是从1970-1-1 0:0:0开始走到此刻的总的毫秒值，1s = 1000ms
        System.out.println("开始");
        //System.exit(0);
        System.out.println("结束");

        long l = System.currentTimeMillis();
        show();
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }

    private static void show() {
        for (int i = 0; i < 100000000; i++) {
            System.out.println("哈哈哈");
        }
    }
}

