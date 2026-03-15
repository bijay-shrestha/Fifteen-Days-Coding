package com.fifteendays.coding.day05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class StringProblems {
    public static void main(String[] args) {
        List<String> names = List.of("apple", "ball", "car", "dog", "elephant", "fox", "giraffe", "home",
                "india", "joker", "kangaroo", "Lama", "mango", "nepal", "optimus", "parrot", "queue", "rat",
                "salmon", "tiger", "umbrella", "van", "wizard", "xray", "yellow", "zebra");

        //Q1: Join all strings with “-” using Collectors.
        String collect = names.stream().collect(Collectors.joining("-"));
        System.out.println(collect);

        //Q3. Convert List<String> to Map<String, Integer> (string → length) using Collectors.toMap.
        Map<String, Integer> groupByNameAndLength = names.stream().collect(toMap(name-> name, String::length));
        System.out.println(groupByNameAndLength);

    }
}
