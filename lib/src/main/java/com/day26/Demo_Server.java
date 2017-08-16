package com.day26;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 * Created by litienan on 2017/8/7.
 */

public class Demo_Server {

    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket socket = serverSocket.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream ps = new PrintStream(socket.getOutputStream());

            ps.println("server 我是好人~");
            System.out.println(br.readLine());

            ps.println("server 你是好人么？");

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void demo() {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket accept = serverSocket.accept();

            OutputStream outputStream = accept.getOutputStream();
            outputStream.write("百度一下".getBytes());

            InputStream inputStream = accept.getInputStream();

            byte[] arr = new byte[1024];
            int len = inputStream.read(arr);
            System.out.println(new String(arr, 0, len));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
