package com.day13;

/**
 * Created by litienan on 2017/6/7.
 */

public class MyStringBuffer {

    public static void main(String args[]) {
        int arr[] = {2, 5, 17, 45, 3, 1};
//        selectSort(arr);
        sortArr(arr);
        print(arr);
//        demo2();
    }

    public static void demo1() {
        String line = "abc";
        StringBuffer sb = new StringBuffer(line);
        sb.reverse();
        System.out.print(sb);
    }

    public static void demo2() {
        StringBuffer sb = new StringBuffer("abc");
        String s = "abc";
        strings(s);
        System.out.println(s);
        strings(sb);
        System.out.println(sb);
    }

    public static void demo3() {

    }

    public static void strings(String s) {
        s += "de";
    }

    public static void strings(StringBuffer sb) {
        sb.append("de");
    }

    //冒泡排序，每一次比较能比较出一个最大值
    public static void sortArr(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //选择排序  每次比较出一个最小值
    public static void selectSort(int[] arr) {
        //
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
