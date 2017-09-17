package com.day16;

import java.util.ArrayList;

/**
 * Created by litienan on 2017/8/25.
 */

public class Fanxing3 {

    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        int[] arr = {11, 22, 33, 44};

        ArrayList al = new ArrayList<>();
        al.add(null);
        al.add("");
        System.out.print(al);

        Object[] array = al.toArray();

    }


}
