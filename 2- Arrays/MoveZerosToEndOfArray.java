package org.datastructuresandalgorithms.arrays;

public class MoveZerosToEndOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 0, 6, 0, 8, 9, 10};
        System.out.println("array before shifting: ");
        for (int num : arr)
            System.out.print(num + " ");
        moveZerosToEnd(arr);
        System.out.println("\narray after shifting: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void moveZerosToEnd(int[] arr) {
        //we will make 2 pointers, one for the zero numbers (j) and one for the non-zero (i)
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[j] == 0 && arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }
}
