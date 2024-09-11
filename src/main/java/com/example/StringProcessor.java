package com.example;

import java.util.Arrays;

public class StringProcessor {

    // Method to process the string and print the results
    public void process(String input) {
        char[] charArray = input.toCharArray();

        System.out.println("Original Array: " + formatArray(charArray));

        Arrays.sort(charArray);

        System.out.println("Sorted Array : " + formatArray(charArray));

        String finalString = new String(charArray);
        System.out.println("Final String : " + finalString);
    }

    // Method to format the character array into the required format
    private String formatArray(char[] array) {
        StringBuilder sb = new StringBuilder("{ ");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }
}
