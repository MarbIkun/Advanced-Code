package com.itheima.msg.service;

import com.itheima.msg.domain.CheckCode;

import java.util.ArrayList;
import java.util.Random;

public abstract class SendMsg {
    // 存储短信验证码的集合
    public ArrayList<CheckCode> list = new ArrayList<>();

    // 定义发送短信验证码时可选的数字字符
    public char[] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    // 发送短信验证码的方法\
    public void sendMsg(String phone) {
        String s = "";
        Random r = new Random();
        for (int j = 0; j < 4; j++) {
            int i = r.nextInt(chs.length);
            s += i;
        }
        CheckCode checkCode = new CheckCode();
        checkCode.setPhone(phone);
        checkCode.setCheckCode(s);
        list.add(checkCode);
        System.out.println("访问" + show() + "短信平台给" + checkCode.getPhone() + "发送短信验证码:" + checkCode.getCheckCode());
    }

    public abstract String show();
}

