package com.itheima.homework;

import java.util.Arrays;

/*
    04、分析以下需求并完成代码
        阅读代码,通过自然排序完成：按照语文成绩升序排列,语文成绩相同,则按继续比英语成绩
        将自然排序相关代码注释,然后通过比较器排序完成：按照年龄升序排列,年龄相同比姓名
        遍历集合,打印对象属性查看结果
*/
public class Test3 {
    private static Student[] stus = new Student[6];

    static {
        stus[0] = new Student("zhangsan", 17, 99, 77);
        stus[1] = new Student("lisi", 21, 85, 86);
        stus[2] = new Student("wangwu", 20, 75, 94);
        stus[3] = new Student("zhaoliu", 17, 75, 95);
        stus[4] = new Student("qianqi", 19, 66, 44);
        stus[5] = new Student("yanzu", 18, 75, 86);
    }

    public static void main(String[] args) {
        //3、通过比较器排序完成：按照年龄升序排列,年龄相同比姓名
        Arrays.sort(stus);
        Arrays.sort(stus, (o1, o2) -> CompareDate.Compare(o1, o2));
        System.out.println(Arrays.toString(stus));


        //2、遍历集合,打印对象属性查看结果
        System.out.println(Arrays.toString(stus));


        //1、通过自然排序完成：按照语文成绩升序排列,语文成绩相同,则按继续比英语成绩（注释掉再写比较器排序）
      Arrays.sort(stus);
        System.out.println(Arrays.toString(stus));

    }

}
