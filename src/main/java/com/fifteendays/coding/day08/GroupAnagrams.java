package com.fifteendays.coding.day08;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};

        List<String> wordsList = Arrays.asList(words);
        Map<String, List<String>> output = new HashMap<>();
        for(String word : wordsList){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sorted = new String(chars);
            output.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        System.out.println(new ArrayList<>(output.values()));
    }
}
