package com.Thread05;

public class Test {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName(); //获取当前线程的名字
        System.out.println(name);
    }
}
