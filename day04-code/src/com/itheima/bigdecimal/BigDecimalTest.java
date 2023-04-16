package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        // 1、把浮点型数据封装成BigDecimal对象，再来参与运算。
// a、public BigDecimal(double val) 得到的BigDecimal对象是无法精确计算浮点型数据的。 注意：不推荐使用这个，
// b、public BigDecimal(String val)  得到的BigDecimal对象是可以精确计算浮点型数据的。 推荐使用。

// 2、public BigDecimal add(BigDecimal augend): 加法
// 3、public BigDecimal subtract(BigDecimal augend): 减法
// 4、public BigDecimal multiply(BigDecimal augend): 乘法
// 5、public BigDecimal divide(BigDecimal b): 除法
// 6、public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式:RoundingMode.HALF_UP) : 除法，可以设置精确几位。
// 7、public double doubleValue() : 把BigDecimal对象又转换成double类型的数据。

        BigDecimal b1 = new BigDecimal("0.5");
        BigDecimal b2 = new BigDecimal("0.3");
        System.out.println(b1.add(b2));//加法
        System.out.println(b1.subtract(b2));//减法
        System.out.println(b1.multiply(b2));//乘法
        //System.out.println(b1.divide(b2));//不精确
        //System.out.println(另一个对象,位数,舍入模式);
        System.out.println(b1.divide(b2, 5, RoundingMode.HALF_UP));//除法
        double d = b1.doubleValue();//把BigDecimal转为double类型数据
        run(d);
    }

    private static void run(double d) {
    }

}
