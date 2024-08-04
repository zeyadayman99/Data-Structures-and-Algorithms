package org.datastructuresandalgorithms.arrays;

public class InsertElementInASpecificPosition {
    public static void main(String[] args) {
        // array is {4, 7, 3, 2, 8} we want to insert num at index i
        // then array is {4, 7, 3, 2, 5, 8}
        int[] arr = {4, 7, 3, 2, 8};
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println("\ninserting 5 at index 4: ");
        int[] newArr = insertElement(arr, 5, 4);
        for (int num : newArr)
            System.out.print(num + " ");
    }

    public static int[] insertElement(int[] arr, int element, int index) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        int[] newArr = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        return newArr;
    }
}
