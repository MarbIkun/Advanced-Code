package com.mrbing.extendsdemo1;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("马荣炳");
        t1.setSkill("会武术");
        System.out.println(t1.getName() + t1.getSkill());

        Student s1 = new Student();
        s1.setName("坤坤");
        s1.setAge(22);
        System.out.println(s1.getName() + s1.getAge());
    }
}
