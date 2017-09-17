package com.day5;

/**
 * 数组
 * Created by litienan on 2017/7/16.
 */

public class MyArrays {

    public static void main(String args[]) {
        int[] arr = {12, 43, 2, 5, 67, 1, 99, 0};
        int i = array3(arr, 199);

        System.out.println(i);
    }


    //动态初始化
    public static void array() {
        //数组是存储同种数据类型的多个值,可以存储基本数据类型和引用数据类型
        int[] arr = new int[2];
        int[] arr1 = new int[3];
        int[] arr2 = arr1;

        arr[0] = 10;
        arr[1] = 20;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println("========");

        arr1[1] = 1;
        arr1[2] = 1;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("========");

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }

    //静态初始化
    public static void array1() {
        int[] arr1 = new int[]{66, 77, 88, 99, 00};
        int[] arr = {11, 22, 33, 44, 55};

        System.out.println(arr1.length);
        System.out.println(arr[0]);
        System.out.println(arr[2]);

    }

    //最值
    public static int array2(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    //根据数值找索引
    public static int array3(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

}

class P{
    private String name;
}