package com.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by litienan on 2017/9/12.
 */

public class MyArrayList {

    public static void main(String[] args) {

    }

    public static void demo(List list) {
        HashSet hs = new HashSet();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            hs.add(iterator.next());
        }

    }

}
