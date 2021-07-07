package com.Thread03;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程次数 "+i);
        }


        return "Yes!";    //返回值就表示线程运行完毕之后的结果
    }
}
