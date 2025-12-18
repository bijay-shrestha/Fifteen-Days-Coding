package com.fifteendays.coding.day02;

/**
 * Write a method to reverse a string without using built-in reverse. Handle NullPointerException
 */
public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, world!";
        System.out.println("Reversed String: " + reverseString(input) );
    }

    public static String reverseString(String input){
        if(input == null || input.isEmpty()){
            throw new NullPointerException("Input string cannot be null or empty");
        }
        StringBuilder sb = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--){
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }
}
