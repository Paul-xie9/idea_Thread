package com.Thread11;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 会出现重复票
 */
public class Ticket implements Runnable {
    private int ticket = 100;   //票的数量
    private Object object = new Object();   //定义锁对象
    private ReentrantLock reentrantLock = new ReentrantLock();  //实例化lock锁

    @Override
    public void run() {
        while (true) {
            try {

                reentrantLock.lock();   //开锁
                if (ticket <= 0) {     //判断票数
                    break;
                } else {
                    //休眠100ms
                    Thread.sleep(100);
                    ticket--;   //卖出一张票，就减一张
                    System.out.println(Thread.currentThread().getName() + "买票中...\n" + "还剩 " + ticket + " 张票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock(); //关锁
            }
            /*
            ctl+alt+l :格式化代码
            ctl+alt+t :调出异常，流程控制语句等
             */

        }
    }
}

