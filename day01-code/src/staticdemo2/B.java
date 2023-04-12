package staticdemo2;

//懒汉式:用对象时,才开始创建对象
public class B {
    //定义类变量,记录类对象
    static B b;//null

    private B() {
    }

    public static B bb() {
        //判断变量是否为null,如果是,才开始创建对象,再将对象的地址值赋值给变量
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
