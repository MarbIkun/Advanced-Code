package com.itheima.interfacedemo1;

import java.util.ArrayList;

public class ClassManager {
    private static ArrayList<Student> list;
    private StudentOp so = new StudentOp2();//接口多态方式创建对象

    static {
        list = new ArrayList<>();
        list.add(new Student("张三", '男', 79));
        list.add(new Student("李四", '男', 99));
        list.add(new Student("坤坤", '女', 89));
    }

    public void printAll() {
        so.printAllStudent(list);
    }
    public void printAvg(){
        so.printAvgStudent(list);
    }
}
