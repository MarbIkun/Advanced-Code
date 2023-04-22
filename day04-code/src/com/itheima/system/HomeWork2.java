package com.itheima.system;

import java.time.LocalDateTime;

public class HomeWork2 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt1 = LocalDateTime.of(2000, 4, 21, 16, 1);
        System.out.println((ldt.getYear() - ldt1.getYear()) * 365);
        System.out.println(ldt.getYear() - ldt1.getYear());

    }
}
