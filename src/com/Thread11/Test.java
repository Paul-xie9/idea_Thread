package com.Thread11;

public class Test {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();   //总的票数

        Thread thread01 = new Thread(ticket);   //三个线程使用一个票数
        Thread thread02 = new Thread(ticket);
        Thread thread03 = new Thread(ticket);

        thread01.setName("窗口一");
        thread02.setName("窗口二");
        thread03.setName("窗口三");

        thread01.start();
        thread02.start();
        thread03.start();

    }
}
