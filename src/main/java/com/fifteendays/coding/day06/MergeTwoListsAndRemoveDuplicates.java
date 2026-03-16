package com.fifteendays.coding.day06;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoListsAndRemoveDuplicates {
    public static void main(String[] args) {
        List<String> names1= List.of("a", "b", "c", "d", "e", "n", "g", "k");
        List<String> names2= List.of("i", "c", "k", "a", "m", "n","o", "p", "q","r", "e");

        List<String> merged = Stream.of(names1, names2)
                .flatMap(Collection::stream)
                .distinct()
                .toList();

        System.out.println(merged);

    }
}
