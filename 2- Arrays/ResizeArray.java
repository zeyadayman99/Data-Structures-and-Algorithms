package org.datastructuresandalgorithms.arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 0};
        System.out.println("array before resizing: ");
        for (int num : arr)
            System.out.print(num + " ");
        //we want to resize the array to double it's size
        int[] newArray = resizeArray(arr, arr.length * 2);
        System.out.println("\narray after resizing: ");
        for (int num : newArray)
            System.out.print(num + " ");
    }

    public static int[] resizeArray(int[] arr, int capacity) {
        int[] newArray = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        arr = newArray;
        return arr;
    }
}
