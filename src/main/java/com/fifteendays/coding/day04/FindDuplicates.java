package com.fifteendays.coding.day04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        String[] alphabets = {"a","b","c","a","e","b","g","b","d","a"};

        Set<String> seen = new HashSet<>();
        Set<String> dups = Arrays.stream(alphabets).filter(s-> !seen.add(s)).collect(Collectors.toSet());

        System.out.println(dups);
    }
}
