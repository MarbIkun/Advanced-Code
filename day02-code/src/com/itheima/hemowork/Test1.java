package com.itheima.hemowork;

public class Test1 {
    public static void main(String[] args) {
        Door d1 = new WoodDoor();
        d1.setWidth(2);
        d1.setHeight(3);
        d1.setBrand("好门");
        d1.open();
        d1.close();

        Door d2 = new ElectricAlarmDoor();
        d2.setWidth(3);
        d2.setHeight(5);
        d2.setBrand("好用");
        d2.open();
        d2.close();
        Alarm a = new ElectricAlarmDoor();
        a.alarm();


    }
}
