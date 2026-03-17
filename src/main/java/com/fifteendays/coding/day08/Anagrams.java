package com.fifteendays.coding.day08;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        System.out.println(checkIfValidAnagram(s1, s2));
    }

    private static boolean checkIfValidAnagram(String s1, String s2) {
        boolean valid = false;

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        String sorted1 = new String(charArray1);
        String sorted2 = new String(charArray2);

        return sorted1.equals(sorted2);


    }
}
