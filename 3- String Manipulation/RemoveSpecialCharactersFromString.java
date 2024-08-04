package org.datastructuresandalgorithms.stringmanipulation;

public class RemoveSpecialCharactersFromString {
    public static void main(String[] args) {
        String str = "j@#$a*&(&v&^&%a&^%$%%";
        System.out.println("string is: " + str);
        removeSpecialChars(str);
    }
    public static void removeSpecialChars(String str) {
        String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("using replaceAll(): " + str1);
        //this regular expression says anything other than from a to z
        //and from A to Z and from 0 to 9 should be replaced with ""
    }
}
