package com.itheima.abstactdemo3;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setScore(99);
        s1.show();
        Teacher t1 = new Teacher();
        t1.setName("李四");
        t1.setSkill("JAVA");
        t1.show();
    }

}
