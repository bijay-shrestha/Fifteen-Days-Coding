package com.fifteendays.coding.day04;

import java.util.HashMap;
import java.util.Map;

/**
 * Calculate the Frequency of Occurrence of Integer
 */
public class FrequencyCounter {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5, 7, 4, 3};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n : numbers){
            freq.put(n, freq.getOrDefault(n,0) + 1);
        }

        System.out.println(freq);

    }
}
