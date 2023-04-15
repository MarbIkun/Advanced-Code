package com.itheima.enum1;

public class Test {
    public static void main(String[] args) {
        //使用枚举,可以对传入的参数进行限制
        tuiJian(Constant.BOY);
    }

    //推荐方法,根据性别推荐对应的数据
    public static void tuiJian(Constant sex) {
        switch (sex) {
            case BOY:
                System.out.println("男频:");
                System.out.println("26岁女房客");
                break;
            case GIRL:
                System.out.println("女频:");
                System.out.println("霸道总裁爱上我");
                break;
        }
    }
}
