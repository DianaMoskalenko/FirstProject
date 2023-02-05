package com.ua.robot.HomeWork8;

import java.util.Random;

public class ArrayClass {
    public static void main(String[] args) {
        int length = 10;
        int[] arr = new int[length];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int minNumber = minNumberArr(arr);
        System.out.println("Minimum number of array is " + minNumber);

        int maxNumber = maxNumberArr(arr);
        System.out.println("Maximum number of array is " + maxNumber);

        int sum = sumArr(arr);
        System.out.println("Sum of array is " + sum);

        int average = averageArr(arr);
        System.out.println("Average of array is " + average);

    }
    static int minNumberArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    static int maxNumberArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int averageArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;

    }
}
