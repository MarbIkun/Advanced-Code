package com.itheima.interfacedemo1;

import java.util.ArrayList;

//方案一
public class StudentOp1 implements StudentOp {
    //展示所有信息
    @Override
    public void printAllStudent(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名是:" + stu.getName() + ",性别是:" + stu.getSex() + ",成绩是:" + stu.getScore());
        }
    }

    //求平均成绩
    @Override
    public void printAvgStudent(ArrayList<Student> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getScore();
        }
        System.out.println("平均分是:" + (sum / list.size()));
    }
}
