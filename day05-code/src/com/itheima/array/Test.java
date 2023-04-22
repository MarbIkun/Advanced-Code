package com.itheima.array;

import com.itheima.lambdamethod.ComparData;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 174.2, 24);
        students[1] = new Student("坤坤", 2.5, 25);
        students[2] = new Student("蔡徐坤", 274.2, 14);
        students[3] = new Student("HelloWorld", 183.6, 53);

        //方式一:比较类implements Comparable<Student>,重写compareTo方法
        /*System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));*/
        Arrays.sort(students);

        //方式二:public static <T> void sort(T[] arr, Comparator<? super T> c)
        //参数一:需要排序的数组
        //参数二:Comparator比较器对象(用来制定对象的比较规则)
        // System.out.println(Arrays.toString(students));
        //Arrays.sort(students, (o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));
        //System.out.println(Arrays.toString(students));

        //使用Lambda简化后的形式
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
        Arrays.sort(students, ((o1, o2) -> ComparData.Compare(o1, o2)));

        System.out.println("----------------------");
        //静态方法引用:1:lambda表达式中,一定要存在静态方法调用,2:前后参数一致
        Arrays.sort(students,ComparData::Compare);
        System.out.println("----------------");
        //实例方法调用:1:lambda表达式中,一定要存在实例方法调用.2:前后参数一致
        ComparData cd = new ComparData();
        Arrays.sort(students,cd::compare1);
        System.out.println(Arrays.toString(students));

    }
}


