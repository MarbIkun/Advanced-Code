package com.itheima.homework;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        arr[0] = new Car(100000);
        arr[1] = new Car(80000);
        arr[2] = new Car(165000);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class Car implements Comparable<Car>{
    private int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car c) {

        return c.price - this.price;
    }
}