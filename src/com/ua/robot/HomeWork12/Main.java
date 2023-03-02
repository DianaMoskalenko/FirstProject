package com.ua.robot.HomeWork12;

public class Main {
    public static void main(String[] args) {
        Personality s1 = new Student("John", 20);
        Personality t1 = new Teacher("Nick", 37);

        s1.talkAboutMyself();
        s1.work();
        System.out.println();
        t1.talkAboutMyself();
        t1.work();


    }
}
