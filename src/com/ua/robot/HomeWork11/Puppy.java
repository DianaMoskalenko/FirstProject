package com.ua.robot.HomeWork11;

public class Puppy extends Dog {

    static {
        System.out.println("2. Puppy static block");
    }
    {
        System.out.println("5. Puppy block");
    }
    {
        System.out.println("6. Puppy block");
    }
    public Puppy() {
        System.out.println("7. Puppy constructor");
    }
}
