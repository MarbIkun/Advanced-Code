package com.mrbing.homework;

import java.math.BigDecimal;

public class Test2 {
    public static void main(String[] args) {
        BigDecimal b1= BigDecimal.valueOf (10.0);
        BigDecimal b2 = BigDecimal.valueOf (3.0);
        System.out.println(b1.divide (b2));
    }
}
