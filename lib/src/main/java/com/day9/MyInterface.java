package com.day9;

/**
 * 接口
 * Created by litienan on 2017/7/19.
 */

public class MyInterface {

    public static void main(String args[]) {

    }

    public void methed(Computer c) {

    }

}

interface Computer {
    int nums = 10;  //在接口中的常量用 static final  修饰
//    public Computer(){}  接口中无构造方法

//    public void ss(){}  接口中不能定义非抽象方法

    void prints();

}

interface TV {
    void show();

    void watch();
}

class Apply implements Computer {

    @Override
    public void prints() {

    }

}
