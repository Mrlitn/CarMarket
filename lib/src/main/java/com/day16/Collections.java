package com.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by litienan on 2017/6/14.
 */

public class Collections {

    public static void main(String args[]) {
        int[] arr = {1, 4, 2, 6, 3, 5};
        demo4(arr);
        print(arr);

//        demo2();
//        int[] arr = {11, 22, 33, 44, 55};
//
//        for (int i : arr) {
//            System.out.print(i);
//        }
//
//        ArrayList<String> al = new ArrayList<>();
//        al.add("a");
//        al.add("b");
//        al.add("c");
//
//        for (String s : al) {
//            System.out.print(s);
//        }

//
//        Tools<Student> tools = new Tools<>();
//        tools.setE(new Student("aa",12));
//        tools.setE(new Student("bb",13));


//        demo();

//        ArrayList arr = new ArrayList();
////        arr.add("a");
////        arr.add("a");
////        arr.add("b");
////        arr.add("c");
////        arr.add("d");
////        arr.add("d");
//
//        arr.add(new Student("av", 12));
//        arr.add(new Student("ab", 13));
//        arr.add(new Student("ac", 14));
//        arr.add(new Student("av", 12));
//
//        System.out.print(demo(arr));
    }

    public static ArrayList demo(ArrayList arr) {
        ArrayList al = new ArrayList();

        Iterator it = arr.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (!al.contains(obj)) {
                al.add(obj);
            }
        }
        return al;
    }

    public static void demo() {
        Stack stack = new Stack();
        stack.in("a");
        stack.in("b");
        stack.in("c");

        while (!stack.isEmpty()) {
            System.out.print(stack.out());
        }
    }

    public static void demo2() {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("b");
        al.add("c");
        al.add("d");

        Iterator it = al.iterator();
        while (it.hasNext()) {
            if ("b".equals(it.next())) {
                it.remove();
            }
        }
        System.out.print(al);

    }

    public static void demo3(int[] arr) {
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

    public static void demo4(int[] arr) {
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

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void demo5() {
        String[] ss = {"a", "b", "c"};
        List<String> list = Arrays.asList(ss);
    }

}
