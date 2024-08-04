package org.datastructuresandalgorithms.arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("array before reversing: ");
        for (int num : arr)
            System.out.print(num + " ");
        reverseArray2(arr, 0, arr.length - 1);
        System.out.println("\narray after reversing: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j ; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    /////////////////////another way////////////////////////
    public static void reverseArray2(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
