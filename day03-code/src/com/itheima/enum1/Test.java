package com.itheima.enum1;

public class Test {
    public static void main(String[] args) {
        tuiJian(Constant.BOY);
    }

    public static void tuiJian(Constant sex) {
        switch (sex) {
            case BOY:
                System.out.println("男频:");
                System.out.println("遮天,完美世界");
                break;
            case GIRL:
                System.out.println("女频");
                System.out.println("霸道总裁爱上我");
                break;
        }
    }
}
