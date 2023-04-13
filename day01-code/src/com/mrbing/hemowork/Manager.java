package com.mrbing.hemowork;

public class Manager extends GeneRality {
    int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public  void work() {
        System.out.println("工号为:" + getId() + "的" + "项目经理" + getName() + "在和客户谈需求," + "项目奖金" + getBonus() + "但是" + getAge() + "岁还没结婚");
    }
}
