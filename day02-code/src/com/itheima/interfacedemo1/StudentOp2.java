package com.itheima.interfacedemo1;

import java.util.ArrayList;

//方案二
public class StudentOp2 implements StudentOp {
    //展示所有信息,记录男女人数
    @Override
    public void printAllStudent(ArrayList<Student> list) {
        int count1 = 0;//男生人数
        int count2 = 0;//女生人数
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名是:" + stu.getName() + ",性别是:" + stu.getSex() + ",成绩是:" + stu.getScore());
            if (stu.getSex() == '男') {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("男生人数是:" + count1 + ",女生人数是:" + count2);
    }

    //求平均成绩(去掉最高分和最低分)
    @Override
    public void printAvgStudent(ArrayList<Student> list) {
        double sum = 0;
        double max = list.get(0).getScore();
        double min = list.get(0).getScore();
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getScore();
            if (max < list.get(i).getScore()) {
                max = list.get(i).getScore();
            }
            if (min > list.get(i).getScore()) {
                min = list.get(i).getScore();
            }
        }
        System.out.println("平均分是:" + (sum - max - min) / (list.size() - 2));

    }
}
