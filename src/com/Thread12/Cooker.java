package com.Thread12;

public class Cooker extends Thread{

    private Desk desk;
    public Cooker(Desk desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true){
            synchronized(desk.getLock()){
                if (desk.getCount() == 0){
                    break;
                }else {
                    if(!desk.isFlag()){
                        //没有则生产
                        System.out.println("正在生产中...");
                        desk.setFlag(true);
                        desk.getLock().notifyAll();
                    }else {
                        //有则等待
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
