package org.datastructuresandalgorithms.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

public class PrintUniqueCharactersOnly {
    public static void main(String[] args) {
        //input: hello
        //output: heo
        String str = "welcome";
        System.out.println("unique characters only: " + printUniqueOnly(str));
    }
    public static String printUniqueOnly(String str) {
        char[] atrArr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> c = new ArrayList<>();
        for (int i = 0; i < atrArr.length; i++) {
            int index = str.indexOf(atrArr[i], i+1);
            if (index == -1) {
                if(c.contains(atrArr[i]))
                    continue;
                else
                    stringBuilder.append(atrArr[i]);
            } else
                c.add(atrArr[i]);
        }
        return stringBuilder.toString();
    }
}
