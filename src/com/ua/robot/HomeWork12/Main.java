package com.ua.robot.HomeWork12;

public class Main {
    public static void main(String[] args) {
        Personality s1 = new Student("John", 20, "Java developer");
        Personality s2 = new Student("Lisa", 22, "QA");
        Personality t1 = new Teacher("Nick", 37,"HR-manager");
        Personality t2 = new Teacher("Tom", 41, "Python developer");

        s1.talkAboutMyself();
        s1.work();
        System.out.println();
        s2.talkAboutMyself();
        s2.work();
        System.out.println();
        t1.talkAboutMyself();
        t1.work();
        System.out.println();
        t2.talkAboutMyself();
        t2.work();


    }
}
