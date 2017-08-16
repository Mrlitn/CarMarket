package com.day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by litienan on 2017/6/16.
 */

public class MyHashSet {
    private static ArrayList<String> al;

    public static void main(String args[]) {
//        al = new ArrayList<>();
//        al.add("aa");
//        al.add("aa");
//        al.add("bb");
//        al.add("bb");
//        al.add("cc");
//        al.add("cc");
//
//        demo2(al);
//
//        System.out.print(al);
        demo5();
    }

    public static void demo() {
        HashSet<String> hs = new HashSet();
        hs.add("a");
        hs.add("a");
        hs.add("c");
        hs.add("d");

        for (String s : hs) {
            System.out.print(s);
        }

//        System.out.print(hs);
    }

    public static void demo1() {
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("aa", 22));
        hs.add(new Person("aa", 22));
        hs.add(new Person("bb", 33));
        hs.add(new Person("bb", 33));
        hs.add(new Person("bb", 33));

        System.out.print(hs);
    }

    public static void demo2(List<String> list) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(list);

        al.clear();
        al.addAll(lhs);
    }


    public static void demo3() {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("aa", 12));
        ts.add(new Student("bb", 23));

        System.out.print(ts);
    }

    public static void demo4() {
//        TreeSet<String> ts = new TreeSet<>();
//        ts.add("aa");
//        ts.add("aa");
//        ts.add("bb");
//        ts.add("cc");
//        ts.add("dd");
//
//        Iterator it = ts.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next());
//        }

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("d");

        Iterator its = lhs.iterator();
        while (its.hasNext()) {
            System.out.print(its.next());
        }
    }

    public static void demo5() {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("li", 12));
        ts.add(new Person("dg", 23));
        ts.add(new Person("ds", 34));
        ts.add(new Person("ht", 34));
        ts.add(new Person("yh", 11));

        System.out.print(ts);
    }

}
