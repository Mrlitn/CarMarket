package com.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by litienan on 2017/7/24.
 */

public class MyCollection2 {

    public static void main(String[] args) {
        demo7();
    }

    public static void demo() {
        Student2[] student2s = new Student2[5];
//        int[] arr = {1, 23, 4, 5, 6, 3, 32};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        student2s[0] = new Student2("aa", 11);
        student2s[1] = new Student2("bb", 12);
        student2s[2] = new Student2("cc", 13);

        for (int i = 0; i < student2s.length; i++) {
            System.out.println(student2s[i]);
        }

    }

    //集合转数组
    public static void demo1() {
        Collection<Integer> c = new ArrayList<>();
        c.add(11);
        c.add(22);
        c.add(33);
        c.add(44);

        Object[] array = c.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void demo2() {
        Collection<Student2> c = new ArrayList<>();
        c.add(new Student2("aa", 11));
        c.add(new Student2("bb", 22));
        c.add(new Student2("cc", 33));

        Object[] array = c.toArray();
        for (int i = 0; i < array.length; i++) {
            Student2 s2 = (Student2) array[i];
            System.out.println(s2.getName() + "===" + s2.getAge());
        }

    }

    //带All的功能演示
    public static void demo3() {
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(1);
        c1.add(2);
        c1.add(3);

        Collection<Integer> c2 = new ArrayList<>();
        c2.add(1);
        c2.add(4);
        c2.add(5);
        c2.add(6);

//        c1.addAll(c2);
//        c1.removeAll(c2);
//        boolean b = c1.containsAll(c2);
        boolean b = c1.retainAll(c2);

        System.out.println(c1 + "-" + b);
    }

    //Iterater遍历集合 基本类型
    public static void demo4() {
        Collection<Integer> c = new ArrayList<>();
        c.add(4);
        c.add(3);
        c.add(2);
        c.add(1);

        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    //Iterater遍历集合 引用类型
    public static void demo5() {
        Collection<Student2> c = new ArrayList<>();
        c.add(new Student2("aa", 11));
        c.add(new Student2("bb", 22));
        c.add(new Student2("cc", 33));

        Iterator<Student2> it = c.iterator();
        while (it.hasNext()) {
            Student2 s2 = it.next();
            System.out.println(s2.getName() + "=" + s2.getAge());
        }

    }

    //List的方法使用
    public static void demo6() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(2, "dd");
        list.set(0, "eee");

        list.remove(1);  //根据索引删除
//        list.remove("a");

        System.out.println(list);
    }

    //并发修改异常
    public static void demo7() {
        List<String> list = new ArrayList<>();
        list.add("dsf");
        list.add("swt");
        list.add("df");
        list.add("ww");
        list.add("oo");

//        Iterator<String> iterator = list.iterator();
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();

            if ("ww".equals(next)) {
//                list.add("javaee");  //修改异常
                iterator.add("javaee");
            }
        }
        System.out.println(list);
    }

}
