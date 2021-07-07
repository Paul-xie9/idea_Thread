package com.Thread01;

public class MyThread extends Thread {
    @Override
    public void run() {
        //线程在开启之后执行的代码
        for (int i = 1; i < 101; i++) {     //快捷方式生成 100.fori
            System.out.println("线程开启  "+ i);   //快捷方式生成 sout
        }

    }

}
