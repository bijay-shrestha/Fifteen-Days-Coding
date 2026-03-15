package com.fifteendays.coding.day05;

import java.util.*;
import java.util.function.BiFunction;

public class SortStringsByLength {

    public static void main(String[] args) {
        //Q1: Sort By Length
        List<String> names = List.of("apple", "ball", "car", "dog", "elephant", "fox", "giraffe", "home",
                "india", "joker", "kangaroo", "Lama", "mango", "nepal", "optimus", "parrot", "queue", "rat",
                "salmon", "tiger", "umbrella", "van", "wizard", "xray", "yellow", "zebra");

        names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        //Q2: BiFunction Example
        BiFunction<Integer, Integer, Integer> addNumber = Integer::sum;
        System.out.println(addNumber.apply(2, 5));

        //Q3: Given List<Integer>, print only even numbers using Stream.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream().filter(num -> (num % 2 == 0)).toList();

        System.out.println(evenNumbers);

        //Q4: Convert List<String> to List<Integer> (length of each string) – map example.
        List<Integer> integerLengthOfNames = names.stream().map(name -> name.length()).toList();
        System.out.println(integerLengthOfNames);

        //Q5: Flatten List<List<Integer>> into single List using flatMap.
        List<List<Integer>> flatMapExample = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
        flatMapExample.stream().flatMap(Collection::stream).forEach(System.out::println);

        //Q6: Find sum of all elements using reduce.
        Integer reduce = numbers.stream().reduce(Integer::sum).get();
        System.out.println(reduce);
    }
}
