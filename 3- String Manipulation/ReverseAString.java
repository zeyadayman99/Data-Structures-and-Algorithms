package org.datastructuresandalgorithms.stringmanipulation;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("string is " + str);
        reverseString(str);
    }

    public static void reverseString(String str) {
//        4 ways to reverse a String:
//          Using toCharArray() method
//          Using charAt(int index) method
//          Using java.lang.StringBuffer class provided reverse() method
//          Using java.lang.StringBuilder class provided reverse() method
        /////////////////////using toCharArray()///////////////////////
        char[] strChars = str.toCharArray();
        for (int i = 0, j = strChars.length - 1; i < j; i++, j--) {
            char temp = strChars[i];
            strChars[i] = strChars[j];
            strChars[j] = temp;
        }
        System.out.println("using toCharArray(): " + String.valueOf(strChars));
        /////////////////////using StringBuffer reverse method////////////////
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("using StringBuffer: " + stringBuffer.reverse().toString());
        /////////////////////using StringBuilder reverse method////////////////
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("using StringBuffer: " + stringBuilder.reverse().toString());
    }
}
