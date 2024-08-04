package org.datastructuresandalgorithms.stringmanipulation;

import java.util.Arrays;

public class SortStringCharactersAlphabetically {
    public static void main(String[] args) {
        String str = "Programming";
        System.out.println("string is " + str);
        System.out.println("string sorted is " + sortStringUsingSortMethod(str));
        System.out.println("string sorted without sort method is " + sortStringWithoutUsingSortMethod(str));
    }

    // Using sort method
    public static String sortStringUsingSortMethod(String str) {
        // Convert to lowercase to ensure proper alphabetical order
        str = str.toLowerCase();
        char[] strChars = str.toCharArray();
        Arrays.sort(strChars);
        return new String(strChars);
    }

    // Without using sort method
    public static String sortStringWithoutUsingSortMethod(String str) {
        // Convert to lowercase to ensure proper alphabetical order
        str = str.toLowerCase();
        char[] strChars = str.toCharArray();
        for (int i = 0; i < strChars.length - 1; i++) {
            for (int j = i + 1; j < strChars.length; j++) {
                if (strChars[i] > strChars[j]) {
                    // Swap the characters
                    char temp = strChars[i];
                    strChars[i] = strChars[j];
                    strChars[j] = temp;
                }
            }
        }
        return new String(strChars);
    }
}
