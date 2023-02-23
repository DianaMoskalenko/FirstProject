package com.ua.robot.HomeWork11;

public class Dog {
    static {
        System.out.println("1. Dog static block");
    }
    {
        System.out.println("3. Dog block");
    }
    public Dog() {
        System.out.println("4. Dog constructor");
    }
}
