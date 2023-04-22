package com.mrbing.exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class MovieTest {
    public static void main(String[] args) {
        Collection<Movie> m = new ArrayList<>();
        m.add(new Movie("肖生克的救赎", 9.9, "赵佳豪"));
        m.add(new Movie("霸王别姬", 9.6, "张国荣"));
        m.add(new Movie("阿甘正传", 9.4, "汤姆"));
        System.out.println(m);

        //迭代器
        Iterator<Movie> i = m.iterator();
        while (i.hasNext()) {
            Movie next = i.next();
            System.out.println(next);
        }

        System.out.println("----------------------");

        //增强for
        for (Movie mv : m) {
            System.out.println(mv);
        }
        System.out.println("---------");
        //使用lambda表达式
        m.forEach(new Consumer<Movie>() {
            @Override
            public void accept(Movie movie) {
                System.out.println(movie);
            }
        });


    }
}
