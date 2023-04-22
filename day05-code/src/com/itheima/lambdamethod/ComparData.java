package com.itheima.lambdamethod;

import com.itheima.array.Student;

public class ComparData {
    public static int Compare(Student o1,Student o2){
        return o1.getAge() - o2.getAge();
    }
    public int compare1(Student o1,Student o2){
        return o1.getAge() - o2.getAge();
    }

}
