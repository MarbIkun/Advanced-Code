package com.itheima.abstactdemo3;

public class Student extends People{
    public int score;
public void show1(){
    System.out.println("我是学生" + getName() + "成绩是:" + getScore());

}

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
