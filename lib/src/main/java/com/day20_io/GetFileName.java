package com.day20_io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/9/9/009.
 */

public class GetFileName {
    public static String [] getFileName(String path)
    {
        File file = new File(path);
        String [] fileName = file.list();
        return fileName;
    }
    public static void getAllFileName(String path,ArrayList<String> fileName)
    {
        File file = new File(path);
        File [] files = file.listFiles();
        String [] names = file.list();
        if(names != null)
            fileName.addAll(Arrays.asList(names));
        for(File a:files)
        {
            if(a.isDirectory())
            {
                getAllFileName(a.getAbsolutePath(),fileName);
            }
        }
    }
    public static void main(String[] args)
    {
//        String [] fileName = getFileName("F:\\BaiduYunDownload");
//        for(String name:fileName)
//        {
//            System.out.println(name);
//        }
//
//        System.out.println("--------------------------------");
//        ArrayList<String> listFileName = new ArrayList<String>();
//        getAllFileName("F:\\BaiduYunDownload",listFileName);
//        for(String name:listFileName)
//        {
//            System.out.println(name);
//        }
        getAllFiles("F:\\BaiduYunDownload");
    }


    public static void getAllFiles(String path){
        File file = new File(path);
        File[] files = file.listFiles();

        for (File f :files){
            System.out.println(f.getName());

//            if (f.isFile()){
//                System.out.println(f.getName());
//            }else if (f.isDirectory()){
//                getAllFiles(f.toString());
//            }

        }

    }

}
