package com.fifteendays.coding.day06;

import java.util.Arrays;
import java.util.List;

public class FindFirst5EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        //Q1: Find first 5 even numbers, square them, and collect.
        numbers.stream().filter(number -> number%2 ==0).limit(5)
                .map(number -> number * number).forEach(System.out::println);

    }
}
