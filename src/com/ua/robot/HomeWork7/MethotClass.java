package com.ua.robot.HomeWork7;

import java.util.Scanner;

public class MethotClass {
    public static void main(String[] args) {
        // print cube of numbers x time
        int cubeNumber = cubeNumber(3);
        System.out.println(cubeNumber);
        //print symbol "*" of cubeX times
        printSymbolOfCube(cubeNumber);
        //print anyone symbol (for example "$") of cubeX times
        String symbol = "$";
        printSymbolOfCube(cubeNumber,symbol);

    }
    static int cubeNumber(int x) {
        return x * x * x;
    }

    static void printSymbolOfCube(int cubeNumber) {
        for (int i = 1; i <= cubeNumber; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
    static void printSymbolOfCube(int cubeNumber, String symbol) {
        for (int i = 0; i < cubeNumber; i++) {
            System.out.print(symbol);
        }
        System.out.println();

    }


        
}
