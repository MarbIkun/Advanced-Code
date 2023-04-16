package com.itheima.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        //接收四个String时间
        String startTime = "2023年11月11日 00时00分00秒";
        String endTime = "2023年11月11日 00时10分00秒";
        String xiaoJiaTime = "2023年11月11日 00时01分18秒";
        String xiaoPiTime = "2023年11月11日 00时10分51秒";
        //将四个String转为Date时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date startD = sdf.parse(startTime);
        Date endtD = sdf.parse(endTime);
        Date xiaoJiaD = sdf.parse(xiaoJiaTime);
        Date xiaoPiD = sdf.parse(xiaoPiTime);
        //通过Date时间获取到对应时间的毫秒值
        long startL = startD.getTime();
        long endL = endtD.getTime();
        long xiaoJiaL = xiaoJiaD.getTime();
        long xiaoPiL = xiaoPiD.getTime();
        //用毫秒值判断
        if (xiaoJiaL >= startL && xiaoJiaL <= endL) {
            System.out.println("小贾参加上了秒杀活动");
        } else {
            System.out.println("小贾没参加上秒杀活动");
        }
        if (xiaoPiL >= startL && xiaoPiL <= endL) {
            System.out.println("小皮参加上了秒杀活动");
        } else {
            System.out.println("小皮没参加上秒杀活动");
        }

    }

}

