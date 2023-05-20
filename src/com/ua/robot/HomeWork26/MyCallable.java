package com.ua.robot.HomeWork26;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
       int a = new Random().nextInt(1, 50);

        return a + "";
    }
}
