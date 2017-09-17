package com.day12;

import java.util.Arrays;

/**
 * String
 * Created by litienan on 2017/7/21.
 */

public class MyString {

    public static void main(String[] args) {
        demo9();
    }

    public static void demo() {
        //String的构造方法
        byte[] arr = {97, 98, 99};

        String s = new String(arr);
        System.out.print(s);

        char[] c = {'a', 'b', 'c'};
        String s1 = new String(c);
        System.out.print(s1);

    }

    public static void demo1() {
        String s = new String("abc");  //对内存中的地址值
        String s1 = "abc";             //常量池中的地址值
        System.out.print(s == s1);
        System.out.print(s.equals(s1));
    }

    public static void demo2() {
        String s = "我爱abc";
        String s1 = "abc";
        System.out.print(s.contains(s1));
    }

    public static void demo3() {
        //String类的获取功能
        String s = "bcda";
        System.out.print(s.charAt(2));
        System.out.print(s.indexOf('a'));
    }

    public static void demo4() {
        //遍历字符串
        String s = "abcdefg";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

    }

    public static void demo5() {
        String s = "sadgsgsds";
//        byte[] arr = s.getBytes();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void demo6() {
        //valueof  可以将任意类型转换成字符串
        char[] arr = {'a', 'b', 'c'};
        String s = String.valueOf(arr);
        System.out.println(s);
    }

    public static void demo7() {
        //替换
        String s = "safsags";
        String s1 = s.replace('s', 'W');
        System.out.print(s1);
    }

    //正则
    public static void demo8() {
        String s = "li tie nan";
        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

    }

    public static void demo9() {
        String s = "12 54 34 90 21";
        String[] split = s.split(" ");

        int[] ints = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(ints);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length - 1) {
                sb.append(ints[i]);
            } else {
                sb.append(ints[i] + " ");
            }
        }

        String ss = new String(sb);

        System.out.println(ss);
    }

}
