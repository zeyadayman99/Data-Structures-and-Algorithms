package org.datastructuresandalgorithms.arrays;

public class FindMinimumValueInArray {
    public static void main(String[] args) {
        int[] arr = {1, 12, 0, 4, -5, 6, -7, 8, -9, 10};
        int min = findMinimumValue(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println("\nsmalled value in the array = " + min);
    }

    public static int findMinimumValue(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Invalid Input");
        int min = arr[0];
        for (int number : arr) {
            if (number < min)
                min = number;
        }
        return min;
    }
}
