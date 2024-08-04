package org.datastructuresandalgorithms.stringmanipulation;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("string is " + str);
        System.out.println("string is palindrome: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        ///a string is palindrome if it's the same as it's reversed
        char[] strArr = str.toCharArray();
        for (int i = 0, j = strArr.length - 1; i < j; i++, j--) {
            if(strArr[i] != strArr[j])
                return false;
        }
        return true;
    }
}
