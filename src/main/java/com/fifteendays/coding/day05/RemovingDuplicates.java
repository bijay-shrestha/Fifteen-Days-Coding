package com.fifteendays.coding.day05;

import java.util.*;
import java.util.stream.Collectors;

public class RemovingDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 5, 6, 3, 8, 3, 10, 2, 7, 5, 3);
        //Q1: Print numbers that are not duplicates
        List<Integer> list = numbers.stream().filter(number -> Collections.frequency(numbers, number) == 1).toList();
        System.out.println(list);

        //Q2. Remove duplicates and sort in descending order.
        numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
