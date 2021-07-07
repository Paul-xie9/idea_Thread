package com.Thread12;

public class Foodie extends Thread {

    private Desk desk;
    public Foodie(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while(true){
            synchronized(desk.getLock()){
                if (desk.getCount() == 0){
                    break;
                }else{
                    if(desk.isFlag()){
                        //有
                        System.out.println("正在用餐...");
                        desk.setFlag(false);
                        desk.getLock().notifyAll();  //唤醒
                        desk.setCount(desk.getCount() - 1);
                    }else{
                        /*没有就等待
                        *使用对象作为锁，必须用这个对象去调用等待唤醒的方法
                        * */
                        try {
                            desk.getLock().wait();   //等待
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
