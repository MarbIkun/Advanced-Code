package com.itheima.msg.domain;

// 记录短信验证码的类
public class CheckCode {
    // 手机号码
    private String phone ;
    // 验证码
    private String checkCode ;
	
	public CheckCode() {
    }

    public CheckCode(String phone, String checkCode) {
        this.phone = phone;
        this.checkCode = checkCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
}
