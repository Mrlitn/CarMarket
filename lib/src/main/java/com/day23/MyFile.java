package com.day23;

import java.io.File;

/**
 * File
 * Created by litienan on 2017/7/28.
 */

public class MyFile {

    public static void main(String[] args) {

    }

    //统计所有文件名
    public static void demo(File dir) {
        //获取所有的文件和文件夹
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName();
            } else {
                demo(file);
            }
        }

    }

}