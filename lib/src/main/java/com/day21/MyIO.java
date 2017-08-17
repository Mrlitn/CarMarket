package com.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * 字符流
 * Created by litienan on 2017/7/27.
 */

public class MyIO {

    public static void main(String[] args) {
        demo7();
    }

    //字符读取数据
    public static void demo() {
        try {
            FileReader fr = new FileReader("a.txt");
            int len;
            while ((len = fr.read()) != -1) {
                System.out.println((char) len);
            }

        } catch (IOException e) {

        }
    }

    //
    public static void demo1() {
        try {
            FileWriter fw = new FileWriter("a.txt");
            fw.write("我不是什么好人11~");
            fw.write(97);
            fw.close();
        } catch (IOException e) {

        }
    }

    //将文本反转
    public static void demo2() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("a.txt"));

            ArrayList<String> al = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                al.add(line);
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));
            for (int i = al.size() - 1; i >= 0; i--) {
                bw.write(al.get(i));
                bw.newLine();
            }
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //LineNumberReader  带行号
    public static void demo3() {
        try {
            LineNumberReader lnr = new LineNumberReader(new FileReader("aa.txt"));

            String line;
            while ((line = lnr.readLine()) != null) {
                System.out.println(lnr.getLineNumber() + ":" + line);
            }

        } catch (IOException e) {

        }
    }

    //装饰设计模式的好处:耦合性不强，被装饰的类变化与装饰类的变化无关
    public static void demo4() {
        SjStudent ss = new SjStudent(new Student());
        ss.code();
    }

    //默认编码表gbk InputStreamReader
    public static void demo5() {
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream(""), "utf-8");
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("aaa.txt"), "gbk");

            int len;
            while ((len = isr.read()) != -1) {
                osw.write(len);
            }

            isr.close();
            osw.close();
        } catch (IOException e) {

        }
    }

    //更高效的读写
    public static void demo6() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt"), "utf-8"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("aaa.txt"), "gbk"));

            int len;
            while ((len = br.read()) != -1) {
                bw.write(len);
            }

            br.close();
            bw.close();
        } catch (IOException e) {

        }
    }

    //计数
    public static void demo7() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("b.txt"));

            String line = br.readLine();
            int times = Integer.parseInt(line);

            if (times > 0) {
                System.out.print("您还有" + times-- + "次机会～");
                FileWriter fw = new FileWriter("b.txt");
                fw.write(times + "");
                fw.close();
            } else {
                System.out.print("请购买正版软件！");
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

interface Coder {
    void code();
}

class Student implements Coder {
    @Override
    public void code() {
        System.out.println("abc");
        System.out.println("bd");
    }
}

class SjStudent implements Coder {
    private Student s;

    public SjStudent(Student s) {
        this.s = s;
    }

    @Override
    public void code() {
        s.code();
        System.out.println("11");
        System.out.println("22");
    }
}