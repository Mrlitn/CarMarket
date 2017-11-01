package com.day20_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Created by litienan on 2017/10/24.
 */

public class MyIO2 {

    public static void main(String[] args) {
        demo3();
    }

    public static void demo() {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            int read;
            while ((read = fis.read()) != -1) {
                System.out.println(read);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void demo1() {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aa.txt"));

            int len;
            while ((len = bis.read()) != -1) {
                bos.write(len);
            }

            bis.close();
            bos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void demo2() {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            FileOutputStream fos = new FileOutputStream("aa.txt");

            byte[] b = new byte[1024 * 8];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }

            fis.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demo3() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入内容：");

            FileOutputStream fos = new FileOutputStream("input.txt");

            while (true) {
                String line = scanner.nextLine();

                if ("quit".equals(line)) {
                    System.out.println("已退出~");
                    break;
                } else {
                    fos.write(line.getBytes());
                    fos.write("\r\n".getBytes());
                }
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
