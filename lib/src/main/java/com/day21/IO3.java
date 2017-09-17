package com.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by litienan on 2017/8/30.
 */

public class IO3 {

    public static void main(String[] args) throws IOException {
        demo1();
    }

    public static void demo() {
        Student3 s3 = new Student3();
        BaseStudent3 bs3 = new BaseStudent3(s3);
        bs3.code3();
    }

    public static void demo1() throws IOException {
        //
        FileReader fr = new FileReader("");
        FileWriter fw = new FileWriter("");

        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);


    }

}

//装饰模式
interface Coder3 {
    void code3();
}

class Student3 implements Coder3 {
    @Override
    public void code3() {
        System.out.println("3333");
    }
}

class BaseStudent3 implements Coder3 {
    private Student3 s3;

    public BaseStudent3(Student3 s3) {
        this.s3 = s3;
    }

    @Override
    public void code3() {
        s3.code3();
        System.out.print("4444");
    }
}

