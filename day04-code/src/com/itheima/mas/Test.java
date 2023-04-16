package com.itheima.mas;

public class Test {
    public static void main(String[] args) {
        // 1、public static int abs(int a)：取绝对值（拿到的结果一定是正数）
// 2、public static double ceil(double a): 向上取整
// 3、public static double floor(double a): 向下取整
// 4、public static long round(double a)：四舍五入
// 5、public static int max(int a, int b)：取较大值
//   public static int min(int a, int b)：取较小值
// 6、 public static double pow(double a, double b)：取次方
// 7、public static double random()： 取随机数 [0.0 , 1.0) (包前不包后)

        System.out.println(Math.abs(-34));//取绝对值
        System.out.println(Math.ceil(12.3));//向上取整
        System.out.println(Math.floor(12.9));//向下取整
        System.out.println(Math.round(3.5));//四舍五入
        System.out.println(Math.round(3.1));
        System.out.println(Math.max(12,56));//取较大值;
        System.out.println(Math.min(12,56));//取较小值
        System.out.println(Math.pow(2,4));//取次方
        System.out.println(Math.random());//取随机数[0.0 , 1.0)(包前不包后)

    }
}
