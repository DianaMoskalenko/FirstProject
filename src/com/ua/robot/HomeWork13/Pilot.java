package com.ua.robot.HomeWork13;

public class Pilot extends Person {

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am a pilot. I have my own plane and car");
    }

    @Override
    public void drive() {
        System.out.println("I can drive");
    }
    public void fly(){
        System.out.println("I can fly");
    }



}
