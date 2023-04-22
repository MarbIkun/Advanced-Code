package com.itheima.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        // 0、获取本地日期和时间对象 now()。
// 5、获取指定日期和时间的LocalDateTime对象：
// public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour,
// 1、可以获取日期和时间的全部信息
// 2、修改时间信息：
// withYear withMonth withDayOfMonth withDayOfYear withHour
// withMinute withSecond withNano
// 3、加多少:
// plusYears  plusMonths plusDays plusWeeks plusHours plusMinutes plusSeconds plusNanos
// 4、减多少：
// minusDays minusYears minusMonths minusWeeks minusHours minusMinutes minusSeconds minusNanos
// 6、 判断2个日期、时间对象，是否相等，在前还是在后： equals、isBefore、isAfter
// 7、可以把LocalDateTime转换成LocalDate和LocalTime
// public LocalDate toLocalDate()
// public LocalTime toLocalTime()
// public static LocalDateTime of(LocalDate date, LocalTime time)

        //获取本地日期和时间对象 now()。
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        //获取指定日期和时间的LocalDateTime对象：
        LocalDateTime ldt1 = LocalDateTime.of(2000, 4, 21, 12, 14);
        System.out.println(ldt1);
        //获取日期和时间的信息
        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int dayOfMonth = ldt.getDayOfMonth();
        int hour = ldt.getHour();
        int second = ldt.getSecond();
        System.out.println(year);
        System.out.println(month);
        System.out.println(dayOfMonth);
        System.out.println(hour);
        System.out.println(second);
        //修改时间信息
        LocalDateTime ldt2 = ldt.withYear(2013);
        LocalDateTime ldt3 = ldt.withMonth(9);
        System.out.println(ldt2);
        System.out.println(ldt3);
        //添加
        LocalDateTime ldt4 = ldt.plusYears(3);
        LocalDateTime ldt5 = ldt.plusMonths(2);
        System.out.println(ldt4);
        System.out.println(ldt5);
        //减少
        LocalDateTime ldt6 = ldt.minusYears(1);
        System.out.println(ldt6);
        //把LocalDateTime转换成LocalDate和LocalTime
        LocalDate ldt7 = ldt.toLocalDate();
        LocalTime ldt8 = ldt.toLocalTime();
        System.out.println(ldt7);
        System.out.println(ldt8);
        //把LocalDate 和LocalTime转换成 LocalDateTime
        LocalDateTime ldt9 = LocalDateTime.of(ldt7, ldt8);
        System.out.println(ldt9);

    }
}
