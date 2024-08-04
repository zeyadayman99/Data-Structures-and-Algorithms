package org.datastructuresandalgorithms.arrays;

public class RemoveEvenNumbersFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 10, 12, 1, 3};
        RemoveEvenNumbersFromArray removeEvenNumbersFromArray
                = new RemoveEvenNumbersFromArray();
        int[] oddArray = removeEvenNumbersFromArray.removeEvenNumbers(arr);
        for (int num : oddArray)
            System.out.print(num + " ");
        System.out.println();
    }

    public int[] removeEvenNumbers(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
                oddCount++;
        }
        int[] oddNumbers = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddNumbers[index] = arr[i];
                index++;
            }
        }
        return oddNumbers;
    }
}
