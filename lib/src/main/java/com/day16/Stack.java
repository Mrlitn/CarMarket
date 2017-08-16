package com.day16;

import java.util.LinkedList;

/**
 * Created by litienan on 2017/6/15.
 */

public class Stack {
    private LinkedList ll = new LinkedList();

    public void in(Object obj) {
        ll.addLast(obj);
    }

    public Object out() {
        return ll.removeLast();
    }

    public boolean isEmpty() {
        return ll.isEmpty();
    }
}
