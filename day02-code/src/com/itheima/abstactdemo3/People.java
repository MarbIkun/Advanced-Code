package com.itheima.abstactdemo3;

public abstract class People {
    private String name;

    public final void show() {
        System.out.println("我要开始自我介绍了");
        show1();
        System.out.println("介绍完毕");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void show1();
}
