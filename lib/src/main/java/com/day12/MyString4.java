package com.day12;

/**
 * Created by litienan on 2017/10/17.
 */

public class MyString4 {
    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        String s = "adaasg";

        char[] chars = s.toCharArray();

        for (char c : chars) {
            System.out.println(c);
        }
    }

}
