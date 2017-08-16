package com.day11;

/**
 * Created by litienan on 2017/6/1.
 */

public class MyString {

    public static void main(String args[]) {
//        demo();
        demo1();
    }

    public static void demo() {
        byte[] b = {97, 98, 99};
        String s = new String(b);

        System.out.print(s);
    }

    public static void demo1() {
        String s = "woshihaoren";
        String phone = "13681531513";

        String p1 = phone.substring(0, 3);
        String p3 = phone.substring(7);

        System.out.print(p1 + "****" + p3);

        int i = s.indexOf("s");
        String ss = s.substring(2);
        System.out.print(ss);
    }

}
