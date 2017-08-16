package com.day25;

/**
 * Created by litienan on 2017/7/2.
 */

public class MySington {

    public static void main(String args[]) {

    }

}

//饿汉式
class SingTon {
    private SingTon() {
    }

    private static SingTon s = new SingTon();

    public static SingTon getInstance() {
        return s;
    }
}

//懒汉式
class SingTons {
    private SingTons() {
    }

    private static SingTons s;

    public static SingTons getInstance() {
        if (s == null) {
            s = new SingTons();
        }
        return s;
    }
}