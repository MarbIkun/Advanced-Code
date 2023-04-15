package com.itheima.innerclass;

public class Test {
    public static void main(String[] args) {
        //通过匿名内部类,获取某个动物对象
        //做了两件事:1.相当于定义了一个子类\实现类 2.立即再创建出该子类\实现类的对象
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗刨");
            }
        };
        goSwim(s);
//通过匿名内部类,获取某个动物对象
        goSwim(new Swimming() {
            @Override
            public void swim() {
                System.out.println("蛙泳");
            }
        });
        goSwim(new Swimming() {
            @Override
            public void swim() {
                System.out.println("猪扒");
            }
        });
    }
//某个动物参加游泳比赛的方法,为了扩展性更好,接收动物对象时,用父类接收
    public static void goSwim(Swimming s) {
        s.swim();
    }
}
