package com.Thread04;

public class Test {
    public static void main(String[] args) {
        MyThread myThread01 = new MyThread("线程一 ");
        MyThread myThread02 = new MyThread("线程二 ");

        //myThread01.setName("小强");
        //myThread02.setName("小明");

        myThread01.start();
        myThread02.start();
    }
}
