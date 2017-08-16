package com.day9;

/**
 * 抽象类
 * Created by litienan on 2017/7/19.
 */

public class MyAbstarct {

    public static void main(String args[]) {
        Animals a = new Cats();
        a.eat();
        a.play();
    }

}

abstract class Animals {
    public Animals() {
    }

    public abstract void eat();

//    public abstract void ss();  //不能用private final static修饰

    public void play() {
        System.out.println("play");
    }

}

class Cats extends Animals {
    @Override
    public void eat() {
        System.out.println("cats eat");
    }
}

