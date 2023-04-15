package com.itheima.hemowork;

public class ElectricAlarmDoor extends Door implements Alarm {

    @Override
    public void open() {
        System.out.println("滴~ 高为:" + getHeight() + ",宽为:" + getWidth() + "的" + getBrand() + "电子门开了");

    }

    @Override
    public void close() {
        System.out.println("滴~ 高为:" + getHeight() + ",宽为:" + getWidth() + "的" + getBrand() + "电子门关了");
    }

    @Override
    public void alarm() {
        System.out.println("呜~报警");
    }
}
