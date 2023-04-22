package com.mrbing.homework;

        import java.util.Arrays;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.Set;
        import java.util.function.BiConsumer;

public class Test3 {
    public static void main(String[] args) {

        String stu = "《红楼梦》-曹雪芹, 《西游记》-吴承恩,《三国演义》-罗贯中,《水浒传》-施耐庵";
        String[] split = stu.split(",");
        System.out.println(Arrays.toString(split));

        HashMap<String, String> map = new HashMap<>();
        for (String s : split) {
            String[] split1 = s.split("-");
            map.put(split1[0], split1[1]);
        }
        System.out.println(map);
        System.out.println("-------------");
        //键找值
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
        System.out.println("--------------");
        //键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }
        System.out.println("------------------");
        //forEach
       /* map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + "---" + s2);
            }
        });*/
        //Lanbda表达式
        map.forEach((s, s2) -> System.out.println(s + "---" + s2));
    }
}
