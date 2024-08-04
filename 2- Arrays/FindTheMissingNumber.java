package org.datastructuresandalgorithms.arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 5, 6, 9, 7, 2};
        //the sum of the first 5 numbers should equal 15
        System.out.println("array : ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println("\nmissing number = " + findTheMissing(arr));
    }

    public static int findTheMissing(int[] arr) {
        //to find the missing number we follow a simple equation
        //the sum of n natural numbers = 1 + 2 + 3 + 4 +...+ n = n * (n + 1)/2
        int max = arr[0];
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            actualSum += arr[i];
        }
        int expectedSum = max * (max + 1) / 2;
        if(expectedSum != actualSum)
            return expectedSum - actualSum;
        else {
            System.out.println("nothing is missing");
            return -1;
        }
    }
}
