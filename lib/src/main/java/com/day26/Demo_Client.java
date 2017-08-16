package com.day26;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 客户端
 * Created by litienan on 2017/8/7.
 */

public class Demo_Client {
    
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        try {
            Socket socket = new Socket("127.0.0.1", 1234);

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream ps = new PrintStream(socket.getOutputStream());

            System.out.println(br.readLine());
            ps.println("client 我也是好人");

            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demo() {
        try {
            Socket socket = new Socket("127.0.0.1", 1234);

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            byte[] arr = new byte[1024];
            int len = is.read(arr);

            System.out.println(new String(arr, 0, len));

            os.write("我不是什么好人".getBytes());

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
