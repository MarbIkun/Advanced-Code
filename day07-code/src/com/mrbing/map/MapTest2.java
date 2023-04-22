package com.mrbing.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        //景点
        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);//将随机索引对应的景点存入集合中
        }
        System.out.println(list);

        //统计每个景点的随机人数
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String jD = list.get(i);
            //判断集合中的kay是否包含本次循环的景点
            if (map.containsKey(jD)) {
                //如果包含,说明该景点有人投票,通过键(景点名称)得到值(该景点投票人数)
                Integer value = map.get(jD);
                //使该景点投票人数+1
                map.put(jD, value + 1);
            }else {
                //如果没有包含,说明该景点这次是第一次被投票,存一次
                map.put(jD, 1);
            }
        }
        System.out.println(map);

    }
}
