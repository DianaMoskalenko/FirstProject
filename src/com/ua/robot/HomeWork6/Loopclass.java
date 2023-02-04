package com.ua.robot.HomeWork6;

public class Loopclass {
    public static void main(String[] args) {
        System.out.println("Number from 1 to 10");
        for (int k = 1; k <= 10; k++) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println("Even number from 1 to 100");
        for (int k = 1; k <= 100; k++) {
            if (k % 2 == 0)
                System.out.print(k);
            else
                System.out.print(" ");
        }
        System.out.println();
        System.out.println("Factorial 7");
        int result = 1;
        for (int k = 1; k <= 7; k++) {
            result *= k;
        }
        System.out.println(result);
        System.out.println("Fibonacci numbers from 1 to 100");
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " );
        do {
            c = a + b;
            System.out.print(b + " ");
            a = b;
            b = c;
        }
        while (c < 100);
    }
}
