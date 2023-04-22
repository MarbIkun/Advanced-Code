package com.itheima.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2043, 5, 30);
        LocalDate end = LocalDate.of(2056, 3, 20);
        //创建Period对象,封装两个日期对象
        Period p1 = Period.between(start, end);
        //通过period对象获取两个日期对象相差的信息
        int years = p1.getYears();
        int months = p1.getMonths();
        int days = p1.getDays();
        System.out.println(years);
        System.out.println(months);
        System.out.println(days);
    }
}
