package com.ua.robot.HomeWork4;

import java.util.Scanner;

public class OperatorClass {
    public static void main(String[] args) {
        //First exercise
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a =sc.nextInt();
        System.out.print("Enter b = ");
        int b =sc.nextInt();

        if(a>b){
            System.out.println("A is a bigger number");

        }
        else if (a == b){
            System.out.println("a=b");
        }
        else {
            System.out.println("b is a bigger number");
        }
        //Second exercise
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter c = ");
        int c =sc2.nextInt();
        System.out.print("Enter d = ");
        int d =sc2.nextInt();

        if(c>d){
            System.out.println("d is a smaller number");

        }
        else if (c == d){
            System.out.println("c=d");
        }
        else {
            System.out.println("c is a smaller number");
        }
        //Third exercise
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter i = ");
        int i =sc1.nextInt();

        if(i % 2 == 0){
            System.out.println("it is an even number");

        }
        else {
            System.out.println("it is an odd number");
        }


    }
}
