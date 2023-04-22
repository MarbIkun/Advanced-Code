package com.itheima.zoneId;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdTest {
    public static void main(String[] args) {
// 1、ZoneId的常见方法：
// public static ZoneId systemDefault(): 获取系统默认的时区
// public static Set<String> getAvailableZoneIds(): 获取Java支持的全部时区Id
// public static ZoneId of(String zoneId) : 把某个时区id封装成ZoneId对象。
// 2、ZonedDateTime：带时区的时间。
// public static ZonedDateTime now(ZoneId zone): 获取某个时区的ZonedDateTime对象。
// public static ZonedDateTime now()：获取系统默认时区的ZonedDateTime对象

        //获取系统默认时区
        ZoneId zi1 = ZoneId.systemDefault();
        System.out.println(zi1);
        //获取JAVA支持的全部时区
        Set<String> sets = ZoneId.getAvailableZoneIds();
        System.out.println(sets);
        //把某个时区id封装成ZoneId对象
        ZoneId zi2 = ZoneId.of("America/Cuiaba");
        System.out.println(zi2);

        //获取某个 时区的ZonedDateTime对象
        ZonedDateTime zdt2 = ZonedDateTime.now(zi2);
        System.out.println(zdt2);
        //获取系统默认时区的ZonedDateTime对象
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1);
        zdt1.withYear(1000);
        zdt1.plusYears(10);
        zdt1.minusYears(10);

    }
}
