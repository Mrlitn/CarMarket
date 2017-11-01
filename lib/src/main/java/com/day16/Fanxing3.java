package com.day16;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by litienan on 2017/8/25.
 */

public class Fanxing3 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("a");
        al.add("b");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("c");

        ArrayList single = getSingle(al);
        System.out.println(single);

        demo();
    }

    public static void demo() {
        ArrayList<String> al = new ArrayList<>();
        al.add("aa");
        al.add("dd");
        al.add("dd");


//        for (String s : al){
//
//        }

        Iterator<String> it = al.iterator();
        while (it.hasNext()) {

        }
    }


    public static ArrayList getSingle(ArrayList al) {
        ArrayList<String> nal = new ArrayList<>();
        Iterator<String> it = al.iterator();

        while (it.hasNext()) {
            String s = it.next();
            if (!nal.contains(s)) {
                nal.add(s);
            }
        }
        return nal;
    }

}


interface Person<T> {
    void show(T t);
}

class SuperM implements Person<String> {
    @Override
    public void show(String s) {

    }
}
