package com.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by litienan on 2017/7/24.
 */

public class Collection2 {

    public static void main(String[] args) {
        demo6();
    }

    //泛型的使用
    public static void demo() {
        Tool2<String> tool2 = new Tool2<>();
        tool2.methed("ss");
    }

    //高级通配符  ?
    public static void demo1() {
        List<?> list = new ArrayList<>();

    }

    //增强for循环
    public static void demo2() {
        int[] arr = {1, 2, 3, 44};
        for (int i : arr) {
            System.out.println(i);
        }

        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("cc");

        for (String s : al) {
            System.out.println(s);
        }

        ArrayList<Student> als = new ArrayList<>();
        als.add(new Student("aa", 11));
        als.add(new Student("bb", 22));
        als.add(new Student("cc", 33));

        for (Student s : als) {
            System.out.println(s);
        }

    }

    //循环删除
    public static void demo3() {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("b");
        al.add("c");
        al.add("d");

//        for (int i = 0; i < al.size(); i++) {
//            if ("b".equals(al.get(i))) {
//                al.remove(i--);  //指针往后到一个
//            }
//        }

        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            if ("b".equals(it.next())) {
                it.remove();
            }
        }

        //增强for循环不能删除，只能循环用
        for (String s : al) {

        }

        System.out.println(al);
    }

    //集合转数组
    public static void demo4() {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

        String[] array = al.toArray(new String[0]); //0 当集合转成数组时，数组长度小于等于集合长度

        for (String s : array) {
            System.out.println(s);
        }

    }

    //数组转集合   但是转化后当集合不能增删，可以使用集合当方法
    public static void demo6() {
        String[] s = {"aa", "bb", "cc"};

        List<String> list = Arrays.asList(s);
        System.out.print(list);
    }

    //可变参数  其实是一个数组
    public static void demo5(int... arr) {

    }
}

//泛型接口
interface Inter<T> {
    void show(T t);
}

class MyInter implements Inter<String> {

    @Override
    public void show(String s) {

    }

}
