package com.fifteendays.coding.day06;

import java.util.List;
import java.util.stream.Collectors;

public class StringProblems {
    public static void main(String[] args) {
        List<String> names = List.of("apple", "ball", "car", "dog", "elephant", "fox", "giraffe", "home",
                "india", "joker", "kangaroo", "Lama", "mango", "nepal", "optimus", "parrot", "queue", "rat",
                "salmon", "tiger", "umbrella", "van", "wizard", "xray", "yellow", "zebra");

        //Q1: Count words longer than 5 letters.
        long count = names.stream().filter(name -> name.length() > 5).collect(Collectors.counting());
        System.out.println(count);
    }
}
