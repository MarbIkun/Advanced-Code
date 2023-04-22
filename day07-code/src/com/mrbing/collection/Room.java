package com.mrbing.collection;

import java.util.*;

public class Room {
    ArrayList<Card> allCard = new ArrayList<>();

    public Room() {
        //点数
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        String[] colors = {"♥", "♠", "♣", "♦"};
        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card c = new Card(number, color, size);
                allCard.add(c);
            }

        }
        //单独存入小大王
        Card c1 = new Card("", "🃏", size++);
        Card c2 = new Card("", "👲", size++);
        Collections.addAll(allCard, c1, c2);
        System.out.println("新牌:" + allCard);

    }

    public void start() {
        //洗牌
        Collections.shuffle(allCard);
        System.out.println("洗牌后:" + allCard);
        //发牌
        ArrayList<Card> yangGuo = new ArrayList<>();
        ArrayList<Card> qiaoFeng = new ArrayList<>();
        ArrayList<Card> guoJing = new ArrayList<>();
        //将牌发给三个玩家
        for (int i = 0; i < allCard.size(); i++) {
            Card card = allCard.get(i);
            if (i % 3 == 0) {
                yangGuo.add(card);
            } else if (i % 3 == 1) {
                qiaoFeng.add(card);
            } else if (i % 3 == 2) {
                guoJing.add(card);
            }
        }
        //排序
        sortCard(yangGuo);
        sortCard(qiaoFeng);
        sortCard(guoJing);
        //看牌
        System.out.println("杨过:" + yangGuo);
        System.out.println("乔峰:" + qiaoFeng);
        System.out.println("郭靖:" + guoJing);
        //获取底牌
        List<Card> lcards = allCard.subList(allCard.size() - 3, allCard.size());
        System.out.println("底牌:" + lcards);
        //乔峰抢到地主,将底牌发给乔帮主,然后重新排序
        qiaoFeng.addAll(lcards);
        sortCard(qiaoFeng);
        System.out.println("乔帮主抢到地主:" + qiaoFeng);
    }

    //排序方法
    private void sortCard(List<Card> cards) {
        Collections.sort(cards, Comparator.comparingInt(Card::getSize));
    }

}
