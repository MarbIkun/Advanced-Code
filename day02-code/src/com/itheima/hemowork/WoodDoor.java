package com.itheima.hemowork;

public class WoodDoor extends Door {
    @Override
    public void open() {
        System.out.println("高为:" + getHeight() + "米,宽为:" + getWidth() + "米的" + getBrand() + "开了");
    }

    @Override
    public void close() {
        System.out.println("高为:" + getHeight() + "米,宽为:" + getWidth() + "米的" + getBrand() + "关了");
    }
}
