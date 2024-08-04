package org.datastructuresandalgorithms.arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = new int[5]; //default values
        arr[0] = 1;
        arr[1] = 4;
        arr[2] = 7;
        arr[3] = 10;
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray(arr);
    }

    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
