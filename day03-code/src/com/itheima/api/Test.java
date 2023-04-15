package com.itheima.api;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 18);
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.equals(s2));
    }
}

class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "学生{" +
                "姓名:" + name + '\'' +
                ", 年龄:" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName());
    }


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


}
