package com.mrbing.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) throws ArithmeticException {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Iterator<String> it = list.iterator();
        while (true) {
            System.out.println(it.next());
        }
    }
}