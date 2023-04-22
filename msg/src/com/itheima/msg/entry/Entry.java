package com.itheima.msg.entry;

import com.itheima.msg.service.AliyunSendMsg;
import com.itheima.msg.service.TencentSendMsg;

import java.util.Scanner;

public class Entry {

    public static void main(String[] args) {

        // 请输入手机号码
        Scanner sc = new Scanner(System.in) ;
        System.out.print("请您输入登录的手机号码：");
        String phone = sc.nextLine();

        // 调用发送短信类的方法发送短信验证码 （如果需要使用腾讯云发短信，创建对象调用sendMsg方法即可）
        AliyunSendMsg aliyunSendMsg = new AliyunSendMsg() ;
        aliyunSendMsg.sendMsg(phone);

        TencentSendMsg tencentSendMsg = new TencentSendMsg();
        tencentSendMsg.sendMsg(phone);

    }
}
