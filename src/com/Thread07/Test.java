package com.Thread07;

public class Test {
    public static void main(String[] args) {
        MyThread01 myThread01 = new MyThread01();
        MyThread02 myThread02 = new MyThread02();
        myThread01.setName("男孩");
        myThread02.setName("女孩");
/**
 * 当普通进程执行完之后，守护线程也没有继续下去的必要，执行一会儿也停止。
 */
        myThread02.setDaemon(true); //设置第二个进程为守护进程

        myThread01.start();
        myThread02.start();
    }
}
