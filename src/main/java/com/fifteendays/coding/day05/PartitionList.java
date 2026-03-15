package com.fifteendays.coding.day05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionList {
    public static void main(String[] args) {
        //Q1:  Partition list into even and odd numbers.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitionMap = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println(partitionMap);

        //Q2: Given List of Integers, Add all the odd and even numbers from the list and give me the total of each
        Map<Boolean, Double> sumOddAndEven = numbers.stream().collect(
                Collectors.partitioningBy(n -> n % 2 == 0, Collectors.summingDouble(Integer::doubleValue)));
        System.out.println(sumOddAndEven);
    }
}
