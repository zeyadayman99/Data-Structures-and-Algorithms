package org.datastructuresandalgorithms.stringmanipulation;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "Programming";
        System.out.println("string is " + str);
        removeDuplicates(str);
    }

    public static void removeDuplicates(String str) {
//        there are 4 approaches we can solve it with:
//          1- using java 8 approach
//          2- using indexOf()
//          3- using character array
//          4- using Set interface

        //1- using java 8 mechanism
        StringBuilder stringBuilder = new StringBuilder();
        str.chars().distinct().forEach(c -> stringBuilder.append((char) c));
        System.out.println("using java 8 mechanism: " + stringBuilder);

        //2- using indexOf()
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = str.indexOf(c, i+1);
            if(index == -1)
                stringBuilder1.append(c);
        }
        System.out.println("using indexOf(): " + stringBuilder1);
        //what this index of does is that it takes a character(ex. c) and searches the rest of the
        //String for its repetition starting from the index i give it (ex. i+1)
        //so that it takes P then searches in rogramming for repetition
        //if there is no duplicates it will return -1
        //and does that with the rest of the chars in the string

        //3- using Set interface
        StringBuilder stringBuilder2 = new StringBuilder();
        Set<Character> charSet = new HashSet<>();
        for (int i = 0 ; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        System.out.print("using Set Interface: ");
        for (Character c : charSet)
            System.out.print(c);
        //note that Set Doesn't allow Duplicates but it doesn't guarantee order
    }
}
