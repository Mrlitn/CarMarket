package com.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by litienan on 2017/10/25.
 */

public class MyIO2 {

    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        try {
            FileReader fr = new FileReader("");
            FileWriter fw = new FileWriter("");

            int len;
            while ((len = fr.read()) != -1) {
                fw.write(len);
            }

            fr.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demo1() {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //字符缓冲区
    public static void demo2() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(""));
            BufferedWriter bw = new BufferedWriter(new FileWriter(""));

            int len;
            while ((len = br.read()) != -1) {
                bw.write(len);
            }

            br.close();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


interface Coder2 {
    void code2();
}

class Student2 implements Coder2 {
    @Override
    public void code2() {
        System.out.println("");
    }
}

class SuperStudent2 implements Coder2 {
    public Student2 s2;

    public SuperStudent2(Student2 s2) {
        this.s2 = s2;
    }

    @Override
    public void code2() {
        s2.code2();

    }

}