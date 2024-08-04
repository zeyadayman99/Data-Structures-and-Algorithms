package org.datastructuresandalgorithms.stringmanipulation;

public class RemoveWhiteSpacesFromString {
    public static void main(String[] args) {
        String str = "  j  a  v  a      Sp   r  i   n  g   ";
        System.out.println("string is: " + str);
        removeWhiteSpace(str);
    }
    public static void removeWhiteSpace(String str) {
        String str1 = str.replaceAll("\\s", "");
        System.out.println("using replaceAll(): " + str1);
        //here "//s" is a unicode that represents white space

        //we can't use trim() as it only removes white spaces
        // from start and end only not all the white spaces
    }
}
