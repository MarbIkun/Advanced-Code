package com.itheima.duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2025,11,11,11,10,10);
        LocalDateTime end = LocalDateTime.of(2025,11,11,11,11,11);
        //得到Duration对象
        Duration d1 = Duration.between(start,end);
        //获取两个时间对象间隔的信息
        long seconds = d1.getSeconds();
        int nano = d1.getNano();
        System.out.println(seconds);
        System.out.println(nano);

    }
}
