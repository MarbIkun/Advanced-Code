package com.mrbing.list;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("王五");
        list.add("赵六");
        list.add("李四");
        list.add("牛爱花");
        list.add("刘华强");
        list.add("张全蛋");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            
        }

    }
}
