package com.mrbing.homework;

public class Test4 {
    public static void main(String[] args) throws ArithmeticException{
        method(new Dog());
        method(new Cat());
    }
  public static void method(Animal a){
        Dog d = (Dog) a;
        d.lookDoor();

    }
}
class Animal{}
class Cat extends Animal{}
class Dog extends Animal{
    public void lookDoor(){
        System.out.println("看门");
    }
}
