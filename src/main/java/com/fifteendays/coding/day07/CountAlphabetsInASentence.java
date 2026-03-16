package com.fifteendays.coding.day07;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountAlphabetsInASentence {
    public static void main(String[] args) {

        String name = "Hello world! My name is Bijay Shrestha. I live in Charlotte, North Carolina. It is a bit gloomy today.";

        System.out.println(countAlphabetsInASentence(name));
        System.out.println("Most repeated alphabet: " + mostRepeatedAlphabetInASentence(name));
    }

    public static Map<String, Integer> countAlphabetsInASentence(String word) {
        Map<String, Integer> outputMap = new HashMap<>();

        String[] wordsArr = word.toLowerCase().split("");
        for(int i = 0; i < wordsArr.length; i++) {
            if(wordsArr[i].equals(" ")){
                continue;
            }
            if(outputMap.containsKey(wordsArr[i])) {
                outputMap.put(wordsArr[i], outputMap.get(wordsArr[i]) + 1);
            }else{
                outputMap.put(wordsArr[i], 1);
            }
        }

        return outputMap;
    }

    //Most Repeated Alphabet
    public static String mostRepeatedAlphabetInASentence(String word) {

        Map<String, Integer> outputMap = countAlphabetsInASentence(word);
        String mostRepeated = Collections.max(outputMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        return mostRepeated;}

}
