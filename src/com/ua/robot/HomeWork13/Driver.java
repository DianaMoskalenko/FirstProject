package com.ua.robot.HomeWork13;

public class Driver extends Person{
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am a driver. I have my own car.");
    }

    @Override
    public void drive() {
        System.out.println("I can drive");

    }
}
