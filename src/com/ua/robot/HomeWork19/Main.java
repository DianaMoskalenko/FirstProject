package com.ua.robot.HomeWork19;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lastName = new ArrayList<>();
        lastName.add("Smith");
        lastName.add("Jones");
        lastName.add("Williams");
        lastName.add("Brown");
        lastName.add("Brown");
        lastName.add("Brown");
        lastName.add("Brown");
        lastName.add("Jones");
        lastName.add("Williams");
        lastName.add("Williams");
        lastName.add("Smith");
        lastName.add("Smith");
        lastName.add("Jones");
        lastName.add("Jones");
        lastName.add("Williams");
        lastName.add("Brown");
        lastName.add("Brown");
        lastName.add("Brown");
        lastName.add("Jones");
        lastName.add("Williams");

        Map<String, Long> sort = lastName.stream().collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        System.out.println(sort + "\n");

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(10));
        }
        System.out.println(numbers);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum = " + sum);
    }
}
