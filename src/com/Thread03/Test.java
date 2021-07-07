package com.Thread03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启之后需要执行里面的call方法
        MyCallable myCallable = new MyCallable();
        //可以获取线程执行完毕之后的结果，也可以作为参数传递给Thread方法
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        //创建线程
        Thread thread01 = new Thread(futureTask);
        //开启线程
        thread01.start();
        //获取线程结果
        String s = futureTask.get();
        System.out.println(s);
    }
}
