package com.itheima.homework;

public class CompareDate {
    public static int Compare(Student o1,Student o2){

        if (o1.getAge() - o2.getAge() != 0){
            return o1.getAge() - o2.getAge();
        }else {
            return o1.getName() .compareTo(o2.getName());
        }

    }
}
