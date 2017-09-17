package com.day13;

/**
 * Created by litienan on 2017/9/8.
 */

public class MyStringBuffer3 {

    public static void main(String[] args) {
        demo2();
    }

    public static void demo() {
        StringBuffer sb = new StringBuffer();
        sb.append("aa");
        sb.append("bb");
        sb.append("cc");
        sb.append("dd");

        sb.insert(2, "ee");
        sb.delete(0, sb.length()); //
        System.out.println(sb);
    }

    public static void demo2() {
        StringBuffer sb = new StringBuffer("haoren");
        sb.replace(0, 3, "huai");  //替换
        sb.reverse();
        System.out.println(sb);
    }

}
