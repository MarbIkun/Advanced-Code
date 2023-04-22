package com.marbing;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "阿萨斯&&阿";

        String s = s1.replaceAll("\\w", " ");
        System.out.println(s);
    }
}
