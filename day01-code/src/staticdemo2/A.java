package staticdemo2;

public class A {
    //饿汉式:用对象时,对象已经创建好了
    //定义类变量,记录类对象
    static A a = new A();

    private A() {
    }

    //定义类方法,返回该对象
    public static A aa() {
        return a;
    }
}
