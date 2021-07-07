package com.Thread10;

public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread01 = new Thread(myRunnable);
        Thread thread02 = new Thread(myRunnable);

        thread01.setName("窗口一");    //ctl+d ：向下复制相同行
        thread02.setName("窗口二");

        thread01.start();
        thread02.start();
    }
}
