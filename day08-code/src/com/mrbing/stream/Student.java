package com.mrbing.stream;


import java.util.Objects;

public class Student /*implements Comparable<Student>*/{
    private String name;
    private int age;
    private double height;

    /*@Override
    public int compareTo(Student o) {
        //根据年龄升序排序: 如果一样：直接不存，TreeSet集合去除重复元素的原理
        return this.getAge() - o.getAge();
    }*/

    //比较元素内容是否相等

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && Double.compare(student.getHeight(), getHeight()) == 0 && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHeight());
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }


}
