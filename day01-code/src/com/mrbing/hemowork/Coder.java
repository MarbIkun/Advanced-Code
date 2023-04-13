package com.mrbing.hemowork;

public class Coder extends GeneRality {

    @Override
    public void work() {
        System.out.println("工号为:" + getId() + "的" + "程序员" + getName() + "根据需求完成代码," + getAge() + "岁就月薪过万了");
    }
}
