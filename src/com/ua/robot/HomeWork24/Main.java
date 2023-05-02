package com.ua.robot.HomeWork24;

public class Main {
    public static void main(String[] args) {
        NumbersThread numbers = new NumbersThread();
        Thread thread0 = new Thread(numbers);
        Thread thread1 = new Thread(numbers);

        thread0.start();
        thread1.start();
    }
}
