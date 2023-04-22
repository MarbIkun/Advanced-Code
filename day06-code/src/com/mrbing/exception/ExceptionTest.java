
package com.mrbing.exception;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            showException();
        } catch (AgeExeption e) {
           e.printStackTrace();
        }


    }
    public static void showException() throws AgeExeption{
        int age = 250;
        if (age >= 0 && age<= 150){
            System.out.println("年龄合法");
        }else {
            throw new AgeExeption(age + "年龄不合法");
        }
    }
}

