package com.day16;

/**
 * Created by litienan on 2017/7/24.
 */

public class Tool2<E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public void methed(E e) {
        System.out.print(e);
    }

    public <T> void show(T t) {
        System.out.print(t);
    }

    public static <W> void show1(W w) {

    }
}
