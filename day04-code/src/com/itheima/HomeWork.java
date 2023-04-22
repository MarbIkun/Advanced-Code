package com.itheima;


public class HomeWork {
    public static void main(String[] args) {
       Integer[] intArray = {1,2,3};
       String[] stringArray = {"java","c++","python"};
       Student[] stuArray = {new Student("张三"),new Student("李四"),new Student("王五")};
        System.out.println(pingJie(intArray));
        System.out.println(pingJie(stringArray));
        System.out.println(pingJie(stuArray));

    }
public static String pingJie(Object[] arr){
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < arr.length - 1; i++) {
        sb.append(arr[i]).append(" ,");
    }
    sb.append(arr[arr.length - 1]).append("]");
    return sb.toString();
}

}
class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "学生{" +
                "姓名:'" + name + '\'' +
                '}';
    }
}