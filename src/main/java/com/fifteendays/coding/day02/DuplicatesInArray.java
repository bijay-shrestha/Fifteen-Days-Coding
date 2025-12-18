package com.fifteendays.coding.day02;

import java.util.HashSet;

/**
 * Write a program to find duplicates in an array of integers.
 *
 * Example:
 * Input: [1, 2, 3, 4, 2, 5, 3, 6, 1]
 * Output: Duplicates: 2, 3, 1
 */
public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] inputNumbers = {1, 2, 3, 4, 2, 5, 3, 6, 1};
        findDuplicates(inputNumbers);
    }

    private static void findDuplicates(int[] inputNumbers) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num: inputNumbers){
            if(!seen.add(num)){
                System.out.println("Duplicate: " + num);
            }
        }
    }
}
