package com.itheima.abstactdemo3;

public class Teacher extends People{
    public String skill;
    public void show1(){
        System.out.println("我是老师" + getName() + "我会" + getSkill());
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
