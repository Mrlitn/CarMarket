package com.day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by litienan on 2017/9/8.
 */

public class MyMap3 {

    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        Map<String, Integer> map = new HashMap<>();
        map.put("aa", 11);
        map.put("bb", 22);
        map.put("cc", 33);
        map.put("dd", 44);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
        }

        Set<String> keySet = map.keySet();
        Iterator<String> iterator1 = keySet.iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            Integer integer = map.get(next);
        }

    }

}
