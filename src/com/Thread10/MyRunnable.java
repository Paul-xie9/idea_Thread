package com.Thread10;

public class MyRunnable implements Runnable{
    private int ticketCount = 100;
    @Override
    public void run() {
        while(true){
            if("窗口一".equals(Thread.currentThread().getName())){
                //同步方法
                boolean result = synchronizedMthod();
                if(result){
                    break;
                }
            }

            if("窗口二".equals(Thread.currentThread().getName())){
                //同步代码块
                synchronized (this){          //还可以将this替换成MyRunnable.class 即当前文件的字节码文件
                    if(ticketCount == 0){
                        break;
                    }else{
                        /*休眠一会儿*/
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticketCount--;
                        System.out.println(Thread.currentThread().getName() + "买票中...\n" + "还剩 " + ticketCount + " 张票");
                    }

                }

            }
        }
    }

    private synchronized boolean synchronizedMthod() {
        if(ticketCount == 0){
            return true;
        }else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + "买票中..." + "还剩 " + ticketCount + " 张票");
            return false;
        }
    }
}
