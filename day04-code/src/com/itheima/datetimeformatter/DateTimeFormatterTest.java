package com.itheima.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //LocalDateTome日期时间对象转字符串日期时间
        LocalDateTime ldtTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String strTime = dtf.format(ldtTime);
        System.out.println(ldtTime);
        System.out.println(strTime);

        //字符串日期时间转 LocalDateTime日期时间对象
        String strTime1 = "2018年05月23日 19:23:34";
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        LocalDateTime ldtTime1 = LocalDateTime.parse(strTime1,dtf1);
        System.out.println(strTime1);
        System.out.println(ldtTime1);

    }
}
