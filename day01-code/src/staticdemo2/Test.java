package staticdemo2;

public class Test {
    public static void main(String[] args) {
        A a = A.aa();
        System.out.println(a);
        A a1 = A.aa();
        System.out.println(a1);
        B b = B.bb();
        System.out.println(b);
        B b1 = B.bb();
        System.out.println(b1);

    }
}
