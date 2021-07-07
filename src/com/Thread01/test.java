package com.Thread01;

public class test {
    public static void main(String[] args) {    //快捷方式生成 psvm
        MyThread myThread1 = new MyThread();    //创建一个线程
        myThread1.start();   //开启线程

        MyThread myThread2 = new MyThread();    //创建一个线程
        myThread2.start();   //开启线程
    }
}
