package com.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by litienan on 2017/6/11.
 */

public class MyCollections {

    public static void main(String args[]) {
        demo3();
    }

    public static void demo() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");

        System.out.print(c.size());
    }

    public static void demo1() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");

        Collection c1 = new ArrayList();
//        c1.add("a");
//        c1.add("b");
        c1.add("z");

        System.out.print(c.containsAll(c1));

    }

    //迭代
    public static void demo2() {
        Collection c = new ArrayList();
        c.add(new StuCollect("aa", 12));
        c.add(new StuCollect("bb", 13));
        c.add(new StuCollect("cc", 14));
        c.add(new StuCollect("dd", 15));

//        c.add("1");
//        c.add("2");
//        c.add("3");
//        c.add("4");

        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }


    public static void demo3() {
        ArrayList<String> al = new ArrayList();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

        ListIterator lit = al.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            if ("a".equals(s)) {
                lit.add("aa");
            }
        }

        System.out.print(al);
    }

}
