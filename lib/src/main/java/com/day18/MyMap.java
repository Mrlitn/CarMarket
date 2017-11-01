package com.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by litienan on 2017/6/26.
 */

public class MyMap {
    
    public static void main(String args[]) {
        demo6();
    }

    public static void demo() {
        Map<String, Integer> map = new HashMap<>();
        map.put("li", 12);
        map.put("wang", 23);
        map.put("zhao", 34);
        map.put("yu", 45);

        for (String s : map.keySet()) {
            System.out.print(s + "=" + map.get(s));
        }

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String maps = it.next();

            System.out.println(maps + "=" + map.get(maps));
        }
    }

    public static void demo1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("li1", 12);
        map.put("wang1", 23);
        map.put("zhao1", 34);
        map.put("yu1", 45);

        //将map转化成 set集合
//        Set<Map.Entry<String, Integer>> set = map.entrySet();
//
//        Iterator<Map.Entry<String, Integer>> it = set.iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, Integer> maps = it.next();
//            String key = maps.getKey();
//            Integer value = maps.getValue();
//            System.out.println(key + "-" + value);
//        }

        for (Map.Entry<String, Integer> maps : map.entrySet()) {
            System.out.println(maps.getKey() + "-" + maps.getValue());
        }
    }

    public static void demo2() {
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(new Student("aa", 11), "sh");
        hm.put(new Student("aa", 11), "sh");
        hm.put(new Student("cc", 33), "hb");
        hm.put(new Student("dd", 44), "zj");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        Iterator<Map.Entry<Student, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Student, String> next = iterator1.next();
            Student key = next.getKey();
            String value = next.getValue();

        }


        Set<Student> students = hm.keySet();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            int age = next.getAge();
            String name = next.getName();
        }

        for (Student s : hm.keySet()) {

        }

        System.out.println(hm);
    }

    public static void demo3() {
        TreeMap<Student, String> tm = new TreeMap<>();
        tm.put(new Student("aa", 1), "bj");
        tm.put(new Student("bb", 2), "sh");
        tm.put(new Student("cc", 3), "gz");

        System.out.println(tm);
    }

    public static void demo4() {
        String s = "aavdvcfadasvaasdvasasd";
        char[] chars = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character c : chars) {
            hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
        }

        for (Character cc : hm.keySet()) {
            System.out.println("字母" + cc + "共出现了：" + hm.get(cc));
        }
    }

    //双列集合
    public static void demo5() {
        HashMap<Student, String> hm11 = new HashMap<>();
        hm11.put(new Student("11", 11), "11");
        hm11.put(new Student("22", 22), "22");
        hm11.put(new Student("33", 33), "33");
        hm11.put(new Student("44", 44), "44");

        HashMap<Student, String> hm22 = new HashMap<>();
        hm22.put(new Student("1111", 1111), "1111");
        hm22.put(new Student("2222", 2222), "2222");
        hm22.put(new Student("3333", 3333), "3333");
        hm22.put(new Student("4444", 4444), "4444");

        HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
        hm.put(hm11, "11期");
        hm.put(hm22, "22期");

        for (HashMap<Student, String> key : hm.keySet()) {
            String value = hm.get(key);

            for (Student s : key.keySet()) {
                String value2 = key.get(s);

                System.out.println(value + "-" + value2 + "=" + s);
            }
        }

    }

    //逗地主
    public static void demo6() {
        String[] num = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] se = {"红桃", "方片", "黑桃", "红花"};

        ArrayList<String> al = new ArrayList<>();

        for (String s : num) {
            for (String ss : se) {
                al.add(ss + s);
            }
        }

        al.add("大王");
        al.add("小王");
        Collections.shuffle(al);

        ArrayList<String> dipai = new ArrayList<>();
        ArrayList<String> aa = new ArrayList<>();
        ArrayList<String> bb = new ArrayList<>();
        ArrayList<String> cc = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {
            if (i >= al.size() - 3) {
                dipai.add(al.get(i));
            } else if (i % 3 == 0) {
                aa.add(al.get(i));
            } else if (i % 3 == 1) {
                bb.add(al.get(i));
            } else {
                cc.add(al.get(i));
            }
        }

        System.out.println(dipai);
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
    }

}
