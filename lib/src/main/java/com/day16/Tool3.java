package com.day16;

/**
 * Created by litienan on 2017/8/25.
 */

public class Tool3<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    public void show(T t) {

    }

    public static <Q> void show1(Q q) {  //静态方法必须声明自己的泛型

    }
}
