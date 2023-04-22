package com.mrbing.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Population>> map = new HashMap<>();

        ArrayList<Population> list = new ArrayList<>();
        list.add(new Population("苏州市", 847632));
        list.add(new Population("南京市", 847632));
        list.add(new Population("扬州市", 847632));
        map.put("江苏省", list);

        ArrayList<Population> list1 = new ArrayList<>();
        list1.add(new Population("武汉市", 457342));
        list1.add(new Population("孝感市", 343532));
        list1.add(new Population("十堰市", 124235));
        map.put("湖北省", list1);

        Set<String> set = map.keySet();
        for (String s : set) {
            if ("湖北省".equals(s)) {
                ArrayList<Population> values = map.get(s);
                for (Population value : values) {
                    System.out.println(value);
                }
            }
        }

    }
}

