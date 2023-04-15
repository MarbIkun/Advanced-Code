package com.itheima.fanxing;

//自定义泛型类
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("坤坤");
        list.add("坤坤1");
        String s = list.get(0);
        System.out.println(s);
    }
}
class MyArrayList<E>{//<E extends Animal>
    private Object[] arr = new Object[10];
    private int size;

    public boolean add(E e){
        arr[size++] = e;
        return true;
    }
    public E get(int index){
        Object o = arr[index];
        return (E) o;
    }
}

class Animal{
    class Dog extends Animal{}
    class Pig extends Animal{}
}