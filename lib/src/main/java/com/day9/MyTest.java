package com.day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.zip.GZIPOutputStream;

/**
 * Created by litienan on 2017/7/19.
 */

public class MyTest {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
//        MyTest m = new MyTest();
//        m.change(m.str,m.ch);
//        System.out.print(m.str+"and");
//        System.out.print(m.ch);

        String s = "101,102,102,108";
        String[] split = s.split(",");
        HashSet<String> hs = new HashSet<>();
        for (String ss:split){
            hs.add(ss);
        }
        System.out.print(hs.toString());
//        int ss = ss(2);
//        System.out.print(ss);
    }

    public void change(String str,char[] ch){
        str ="test ok";
        ch[0] = 'g';
    }

    public static int ss(int a){
        int result = 0;
        switch (a){
            case 2:
                result = result+a*2;
        }
        return result;
    }


}


abstract class Ani {
    public String name;
    public int age;

    public Ani() {
    }

    public Ani(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void sleep();

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface Jump {
    void jump();
}

class CatTest extends Ani {

    public CatTest() {
    }

    public CatTest(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

}

class JumpCat extends CatTest implements Jump {
    public JumpCat() {
    }

    public JumpCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {

    }
}


