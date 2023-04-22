package com.marbing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Test4 {
    //键盘录入一个数据,输出这个日期是一年中的第多少天
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个日期:");
        String next = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cd = Calendar.getInstance();
        cd.setTime(sdf.parse(next));
        int i = cd.get(Calendar.DAY_OF_YEAR);
        System.out.println(i);

    }
}
