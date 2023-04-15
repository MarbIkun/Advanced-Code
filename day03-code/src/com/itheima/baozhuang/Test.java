package com.itheima.baozhuang;

public class Test {
    public static void main(String[] args) {

        int a = 18;
        //将基本数据类型和包装类型相互转换
        //自动装箱: 将基本数据类型转为包装类型
        Integer i1 = a;
        //自动拆箱: 将包装类型转为基本数据类型
        int a1 = i1;
        System.out.println(i1);
        System.out.println(a1);

        System.out.println("================");
        //将基本数据类型和字符串类型相互转换
        //基本数据类型转为字符串类型
        //方式一: 直接字符串拼接
        String s1 = a + " ";
        //方式二: 先自动装箱,再调用toString()
        Integer in1 = a;
        String s2 = in1.toString();
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("==============");
        //字符串类型转为基本数据类型  注意: 字符串数据必须是数值字符串
        //方式一: parseInt(String)
        int i = Integer.parseInt("12");
        //方式二: valurOf(String)
        Integer integer = Integer.valueOf("13");
        System.out.println(i);
        System.out.println(integer);

    }
}
