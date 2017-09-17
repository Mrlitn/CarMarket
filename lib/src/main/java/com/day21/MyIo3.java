package com.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by litienan on 2017/9/9.
 */

public class MyIo3 {

    public static void main(String[] args) throws IOException {
        demo4();
    }

    public static void demo() throws IOException {
        FileReader fr = new FileReader("a.txt");
        int len;
        int read = fr.read();

    }

    public static void demo1() throws IOException {
        FileWriter fw = new FileWriter("b.txt");
        fw.write("IO 我学了第三遍了～");
        fw.close();
    }

    public static void demo2() throws IOException {
        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b03.txt");

        int len;
        char[] c = new char[1024];
        while ((len = fr.read(c)) != -1) {
            fw.write(c, 0, len);
        }

        fr.close();
        fw.close();
    }

    //带缓冲区带字符流
    public static void demo3() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b03.txt"));

        int len;
        while ((len = br.read()) != -1) {
            bw.write(len);
        }

        br.close();
        bw.close();
    }

    //newLine()和readLine()
    public static void demo4() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("b03.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();
    }

}
