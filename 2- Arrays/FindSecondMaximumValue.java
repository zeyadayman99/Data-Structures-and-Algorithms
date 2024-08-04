package org.datastructuresandalgorithms.arrays;

public class FindSecondMaximumValue {
    public static void main(String[] args) {
        int[] arr = {1, 12, 0, 4, -5, 6, -7, 8, -9, 1};
        int secMax = findSecondMaxValue(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println("\nsecond maximum value in the array = " + secMax);
    }

    public static int findSecondMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        return secMax;
    }

}
