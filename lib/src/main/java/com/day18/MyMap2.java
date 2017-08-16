package com.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by litienan on 2017/7/26.
 */

public class MyMap2 {

    public static void main(String[] args) {
        demo5();
    }

    //Map  K唯一 V  如果K重复则覆盖上一个
    public static void demo() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 11);
        hm.put("b", 22);
        hm.put("a", 33);

        boolean a = hm.containsKey("a");
        boolean b = hm.containsValue(11);

        System.out.println(hm);
    }

    //Map遍历 第一种
    public static void demo1() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 11);
        hm.put("b", 22);
        hm.put("a", 33);

        Integer a = hm.get("a");

        Set<String> set = hm.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            Integer integer = hm.get(next);
            System.out.println(next + "==" + integer);
        }

//        for (String s : hm.keySet()) {
//            System.out.println(s + "-" + hm.get(s));
//        }

    }

    //Map遍历 第二种
    public static void demo2() {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 11);
        hm.put("b", 22);
        hm.put("a", 33);
        hm.put("c", 44);

//        Set<Map.Entry<String, Integer>> set = hm.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> next = iterator.next();
//
//            String key = next.getKey();
//            Integer value = next.getValue();
//            System.out.println(key + "-=" + value);
//        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }

    }

    //
    public static void demo3() {
        HashMap<Student2, String> hm = new HashMap<>();
        hm.put(new Student2("aa", 11), "bj");
        hm.put(new Student2("aa", 11), "sh");
        hm.put(new Student2("bb", 33), "gz");
        hm.put(new Student2("cc", 44), "sz");

        System.out.println(hm);
    }

    //TreeMap
    public static void demo4() {
        TreeMap<Student2, String> tm = new TreeMap<>();
        tm.put(new Student2("aa", 11), "A");
        tm.put(new Student2("bb", 222), "B");
        tm.put(new Student2("cc", 33), "C");
        tm.put(new Student2("dd", 444), "D");

        System.out.println(tm);
    }

    //统计字符串个数
    public static void demo5() {
        String s = "adfsgrvdsdsfegrdsfawergwaf";
        char[] chars = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character c : chars) {
            hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
        }

        for (Character c : hm.keySet()) {
            System.out.println(c + "=" + hm.get(c));
        }
    }

    //Collections
    public static void demo6() {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("a");

        Collections.sort(al);
    }

}
