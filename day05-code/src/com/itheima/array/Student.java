package com.itheima.array;

public class Student implements Comparable<Student> {
    private String name;
    private double height;
    private int age;

    @Override
    public int compareTo(Student o) {
        /*this:已经比较完的元素   o:即将比较的元素
        返回结果:
        负数:代表即将比较的元素年龄大,将o元素放在数组后面
        正数:代表即将比较的元素年龄小,将o元素放在数组前面
        0:相等,依次存入
        * */
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

