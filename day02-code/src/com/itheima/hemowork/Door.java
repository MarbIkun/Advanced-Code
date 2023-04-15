package com.itheima.hemowork;

public abstract class Door {
    public double width;
    public double height;
    public String brand;

    public Door() {
    }

    public Door(double width, double height, String brand) {
        this.width = width;
        this.height = height;
        this.brand = brand;
    }

    public abstract void open();

    public abstract void close();


    /**
     * 获取
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     *
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 获取
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     *
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     *
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }


}
