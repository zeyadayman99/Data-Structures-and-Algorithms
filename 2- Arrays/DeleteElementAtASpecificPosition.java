package org.datastructuresandalgorithms.arrays;

public class DeleteElementAtASpecificPosition {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 2, 8};
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println("\ndelete number 3: ");
        int[] newArr = deleteElement(arr, 4);
        for (int num : newArr)
            System.out.print(num + " ");
    }

    public static int[] deleteElement(int[] arr, int element) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        int count = 0;
        for (int value : arr) {
            if (value == element) {
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("Element not found");
        }

        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int value : arr) {
            if (value != element) {
                newArr[j++] = value;
            }
        }

        return newArr;
    }
}
