package com.Thread12;

public class Desk {
    //定义一个标签

    //public static boolean flag = false; //true:表示桌子上面有汉堡，允许顾客执行；flase：表示桌子上面没有汉堡，允许厨师执行
    private boolean flag;

    //public static int count = 10;   //汉堡的总数量
    private int count = 10;

    //public static final Object lock = new Object(); //锁对象
    private final Object lock = new Object();

    public Desk() {
    }

    public Desk(boolean flag, int count) {
        this.flag = flag;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "flag=" + flag +
                ", count=" + count +
                ", lock=" + lock +
                '}';
    }
}