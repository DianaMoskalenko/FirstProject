package com.ua.robot.HomeWork24;

public class NumbersThread implements Runnable {
    @Override
    public void run() {
        try{
            for (int i =0; i<10;i++){
                System.out.println("Thread: "+ Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
