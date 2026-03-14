package com.fifteendays.coding.day05;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class SortStringsByLength {

    public static void main(String[] args) {
        List<String> names = List.of("apple", "ball", "car", "dog", "elephant", "fox", "giraffe", "home",
                "india", "joker", "kangaroo", "Lama", "mango", "nepal", "optimus", "parrot", "queue", "rat",
                "salmon", "tiger", "umbrella", "van", "wizard", "xray", "yellow", "zebra");

        names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> addNumber = (a, b) -> a + b;
        System.out.println(addNumber.apply(2, 5));

    }
}
