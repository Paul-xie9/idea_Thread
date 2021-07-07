package com.Thread02;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        //线程在开启之后执行的代码
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"第二种方式实现线程 "+i);
        }
    }
}
