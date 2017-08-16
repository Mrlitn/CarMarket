package com.day13;

/**
 * StringBuffer
 * Created by litienan on 2017/7/21.
 */

public class MyStringBuffer2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String s = demo3(arr);
        System.out.print(s);
    }

    public static void demo() {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = sb.append("abcde");
        StringBuffer sb2 = sb.append(true);

        sb.delete(1, 2);

        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
    }

    public static void demo1() {
        StringBuffer sb = new StringBuffer();
        sb.append("woshihaoren");

//        sb.replace(5, 8, "hua");

        sb.reverse(); //反转
        System.out.println(sb.toString());
    }

    public static void demo2() {
        //String --> StringBuffer
        String s = "abc";
        StringBuffer sb = new StringBuffer(s);
        sb.append("de");
        System.out.print(sb);

        //StringBuffer --> String
        StringBuffer sb1 = new StringBuffer("abcdef");

        String ss = new String(sb1);
        String s1 = sb1.toString();
        String substring = sb1.substring(0);

    }

    public static String demo3(int[] arr) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }

    public static void demo4() {
        //基本数据类型传递：不改变值
        //引用数据类型:改变
        //String虽然是引用数据类型，但是当作值传递  不改变值
    }

}
