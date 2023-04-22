package com.itheima.Instant;

import java.time.Instant;

public class InstantTest {
    public static void main(String[] args) {
// 1、 public static Instant now(); 创建Instant的不可变对象，获取此刻时间戳信息
// 2、public long getEpochSecond();获取从时间原点开始记录的总秒数
// 3、public int getNano(); 获取当前时间戳对象中不够1秒的纳秒数

        //创建Instant的不可变对象,获取此刻时间戳信息
        Instant is = Instant.now();
        System.out.println(is);
        //获取从时间原点开始记录的总秒数
        long ls = is.getEpochSecond();
        System.out.println(ls);
        //获取当前时间戳对象中不够1秒的纳秒数
        int ns = is.getNano();
        System.out.println(ns);
        is.plusSeconds(10);
        is.minusSeconds(10);
        //Instant对象的作用,做代码的性能分析,或者记录用户的操作时间点
        System.out.println("当前用户在什么时刻:" + Instant.now() + "做了搜索操作");
    }
}
