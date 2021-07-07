package com.Thread08;

import java.util.concurrent.FutureTask;

/**
 * 线程调度，java默认使用抢占方式调度线程
 * 优先级范围：1 - 10 ；Java默认是 5
 */ 
public class Test {
    public static void main(String[] args) {
        MyCall myCall = new MyCall();
        FutureTask<String> futureTask = new FutureTask<>(myCall);
        Thread thread01 = new Thread(futureTask);
        thread01.setName("小孩");
        //thread01.setPriority(1);    //设置线程优先级
        thread01.start();

        MyCall myCall02 = new MyCall();
        FutureTask<String> futureTask02 = new FutureTask<>(myCall02);
        Thread thread02 = new Thread(futureTask02);
        thread02.setName("大人");
        thread02.start();

    }
}
