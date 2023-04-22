package com.mrbing.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("蜘蛛精;", 162.5);
        map.put("蜘蛛精;", 169.8);
        map.put("紫霞;", 165.8);
        map.put("至尊宝;", 169.5);
        map.put("牛魔王;", 183.6);
        System.out.println(map);
        //键找值
        //1:获取map集合中所有的键集合
        Set<String> set = map.keySet();
        for (String key : set) {
            //2:通过每个key拿到对应的value
            Double value = map.get(key);
            System.out.println(key + "---" + value);
        }
        System.out.println("-------------------");
        //键值对
        //1:获取键值对的集合
        Set<Map.Entry<String, Double>> entrys = map.entrySet();
        //2:遍历键值对集合,拿到每一个entrys键值对对象
        for (Map.Entry<String, Double> entry : entrys) {
            //3:通过entry键值对对象,分别获取键,值
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "---" + value) ;
        }
        System.out.println("--------------------");
        //Lambda表达式
      /*  map.forEach(new BiConsumer<String, Double>() {
            @Override
            public void accept(String s, Double aDouble) {
                System.out.println(s + "---" + aDouble);
            }
        });*/
        map.forEach((s, aDouble) -> System.out.println(s + "---" + aDouble));


    }
}
