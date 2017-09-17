package com.day17;

import java.util.HashSet;

/**
 * Created by litienan on 2017/8/28.
 */

public class HashSet3 {

    public static void main(String args[]) {
        demo();
    }

    //允许存储null,存储相同的返回false
    public static void demo() {
        HashSet<String> hs = new HashSet<>();
        hs.add("");
        hs.add(null);
        hs.add("a");
        hs.add("a");
        System.out.print(hs);

    }

    public static void demo1() {

    }

    public static void demo2() {

    }

}
