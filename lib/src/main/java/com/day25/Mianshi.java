package com.day25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by litienan on 2017/8/2.
 */

public class Mianshi {

    public static void main(String[] args) {
        HashMap<Integer, User> hm = new HashMap<>();

        User u1 = new User("a", 12);
        User u2 = new User("b", 32);
        User u3 = new User("c", 21);
        User u4 = new User("d", 34);

        hm.put(1, u1);
        hm.put(2, u2);
        hm.put(3, u3);
        hm.put(4, u4);

        System.out.println("======"+hm.toString());
        HashMap hashMap = sortMap(hm);
        System.out.println(hashMap.toString());

    }

    public static HashMap sortMap(HashMap<Integer, User> hm) {
        LinkedHashMap<Integer, User> lhm = new LinkedHashMap<>();

        ArrayList<Map.Entry<Integer, User>> al = new ArrayList<>();

        Set<Map.Entry<Integer, User>> entries = hm.entrySet();
        Iterator<Map.Entry<Integer, User>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, User> next = iterator.next();
            al.add(next);
        }

        Collections.sort(al, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });

        Iterator<Map.Entry<Integer, User>> iterator1 = al.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, User> next = iterator1.next();
            lhm.put(next.getKey(), next.getValue());
        }

        return lhm;
    }

}
