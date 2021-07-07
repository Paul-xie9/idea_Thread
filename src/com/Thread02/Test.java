package com.Thread02;

import com.Thread01.MyThread;

public class Test {
    public static void main(String[] args) {
        /**
         * 创建了一个参数对象
         */
        MyRunnable myRunnable01 = new  MyRunnable();
        /**
         * 创建一个线程对象，并将其作为参数传递给Thread
         */
        Thread thread01 = new Thread(myRunnable01);
        thread01.start();   //开启线程

        /**
         * 第二个线程
         */
        /**
         * 创建了一个参数对象
         */
        MyRunnable myRunnable02 = new MyRunnable();
        /**
         * 创建一个线程对象，并将其作为参数传递给Thread
         */
        Thread thread02 = new Thread(myRunnable02);
        thread02.start();   //开启线程
    }
}
