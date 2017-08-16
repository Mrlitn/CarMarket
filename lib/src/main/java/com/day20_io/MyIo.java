package com.day20_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 字节流
 * Created by litienan on 2017/7/27.
 */

public class MyIo {

    public static void main(String[] args) {
        demo7();
    }

    //字节输入流
    public static void demo() {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.println(b);
            }
            fis.close();
        } catch (IOException e) {

        }
    }

    //字节输出流
    public static void demo1() {
        try {
            byte[] b = {97, 98, 99, 100};
            FileOutputStream fos = new FileOutputStream("b.txt", true);  //true 可以追加添加
            fos.write(b);

            fos.close();
        } catch (IOException e) {

        }
    }

    //
    public static void demo2() {
        try {
            FileInputStream fis = new FileInputStream("大力哥.jpg");
            FileOutputStream fos = new FileOutputStream("copy.jpg");

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //有可能导致内存溢出
    public static void demo3() {
        try {
            FileInputStream fis = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            byte[] arr = new byte[fis.available()];
            fis.read(arr);
            fos.write(arr);

            fis.close();
            fos.close();
        } catch (IOException e) {

        }
    }

    //标准写法
    public static void demo4() {
        try {
            FileInputStream fis = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            byte[] arr = new byte[1024 * 4];
            int len;
            while ((len = fis.read(arr)) != -1) {
                fos.write(arr, 0, len);
            }

            fis.close();
            fos.close();

        } catch (IOException e) {

        }
    }

    //BufferedInputStream
    public static void demo5() {
        try {
            FileInputStream fis = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            BufferedInputStream bts = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int len;
            while ((len = bts.read()) != -1) {
                bos.write(len);
            }

            bts.close();
            bos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //flush和close方法
    public static void demo6() {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(""));

            int len;
            while ((len = bis.read()) != -1) {
                bos.write(len);
            }

            bis.close();
            bos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //保存键盘输入的值
    public static void demo7() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入内容：");

            FileOutputStream fos = new FileOutputStream("xx.txt");

            while (true) {
                String next = scanner.next();

                if ("quit".equals(next)) {
                    break;
                } else {
                    fos.write(next.getBytes());
                }
            }

            fos.close();
        } catch (IOException e) {

        }
    }

}
