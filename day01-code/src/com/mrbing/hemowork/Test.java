package com.mrbing.hemowork;

public class Test {
    public static void main(String[] args) {
        Coder co = new Coder();
        co.setId("9527");
        co.setName("小李");
        co.setAge(26);
        Manager ma = new Manager();
        ma.setId("001");
        ma.setName("老张");
        ma.setBonus(20000);
        ma.setAge(38);
        co.work();
        ma.work();
    }
}
