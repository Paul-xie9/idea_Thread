package com.Thread09;

/**
 * 会出现重复票
 */
public class Ticket implements Runnable{
    private int ticket = 100;   //票的数量
    private Object object = new Object();   //定义锁对象
    @Override
    public void run() {
        while(true){
            /*
            synchronized(任意锁对象) ；锁住共享的数据代码块，确保数据的安全。
             */
            synchronized(object) {  //多个线程只能使用同一把锁
                if (ticket < 0) {     //判断票数
                    break;
                } else {

                    //休眠100ms
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    ticket--;   //卖出一张票，就减一张
                    System.out.println(Thread.currentThread().getName() + "买票中...\n" + "还剩 " + ticket + " 张票");
                    }
                }
            }
        }
    }

