package com.mrbing.collection;

/*业务需求分析:
        业务: 总共有54张牌。
        点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
        花色: "♥","♠","♣", "♦";
        大小王: "👲" , "🃏"
        点数分别要组合4种花色，大小王各一张。
        斗地主：发出51张牌，剩下3张作为底牌。*/
public class GameTest {
    public static void main(String[] args) {

        Room r = new Room();

        r.start();
    }
}
