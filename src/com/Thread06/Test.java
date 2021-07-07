package com.Thread06;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        /**
         *  System.out.println("睡觉前。。。");
         *         Thread.sleep(2000);
         *         System.out.println("开始睡觉了");
         */

        MyRunnable myRunnable = new MyRunnable();
        Thread thread01 = new Thread(myRunnable);
        Thread thread02 = new Thread(myRunnable);
        thread01.start();
        thread02.start();
    }
}
