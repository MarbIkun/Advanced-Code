package com.itheima.ploydemo1;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Student s1 = new Student();
        go(t1);

    }

    public static void go(People p) {
        p.run();
        if (p instanceof  Teacher ){
            Teacher t = (Teacher) p;
            t.teach();
        }else if (p instanceof  Student){
            Student s = (Student) p;
            s.study();
        }else {
            System.out.println("您的类型错误!");
        }


    }
}
