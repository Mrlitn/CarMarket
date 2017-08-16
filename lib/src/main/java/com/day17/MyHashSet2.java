package com.day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by litienan on 2017/7/25.
 */

public class MyHashSet2 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("aa");
        al.add("aa");
        al.add("bb");
        al.add("bb");
        al.add("dd");
        al.add("cc");

        demo7(al);
        System.out.println(al);
    }

    //Set集合 无序 无索引 无重复
    public static void demo() {
        HashSet<String> hs = new HashSet<>();
        hs.add("a");
        hs.add("c");
        hs.add("a");
        hs.add("b");
        hs.add("d");

        for (String s : hs) {
            System.out.println(s);
        }
    }

    //存储自定义对象
    public static void demo1() {
        HashSet<Student2> hs = new HashSet<>();
        hs.add(new Student2("aa", 11));
        hs.add(new Student2("aa", 11));
        hs.add(new Student2("cc", 33));
        hs.add(new Student2("bb", 44));

        System.out.println(hs);
    }

    //LinkedHashSet  保证怎么存就怎么取，且唯一
    public static void demo2() {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("a");
        lhs.add("a");
        lhs.add("d");
        lhs.add("b");
        lhs.add("c");
        lhs.add("c");

        System.out.println(lhs);
    }

    //10个  0-20的随机数
    public static void demo3() {
        Random random = new Random();
        HashSet<Integer> hs = new HashSet<>();

        while (hs.size() < 10) {
            hs.add(random.nextInt(21));
        }

        for (Integer i : hs) {
            System.out.println(i);
        }
    }

    public static void demo4(List<String> list) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(list);

        list.clear();
        list.addAll(lhs);

    }

    //TreeSet 是用来排序的 且保证唯一
    public static void demo5() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(0);

        System.out.println(ts);

    }

    //TreeSet 存储自定义对象  0返回一个  -1倒序  1怎么存就怎么取
    public static void demo6() {
        TreeSet<Student2> ts = new TreeSet<>();
        ts.add(new Student2("aa", 11));
        ts.add(new Student2("bb", 22));
        ts.add(new Student2("cc", 3));
        ts.add(new Student2("dd", 44));

//        Iterator<Student2> iterator = ts.iterator();
//        while (iterator.hasNext()) {
//            Student2 student2 = iterator.next();
//
//        }

        System.out.println(ts);
    }

    //
    public static void demo7(List<String> list) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num = s1.compareTo(s2);
                return num == 0 ? 1 : num;
            }
        });
        ts.addAll(list);

        list.clear();
        list.addAll(ts);

    }

}
