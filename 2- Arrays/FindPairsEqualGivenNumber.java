package org.datastructuresandalgorithms.arrays;

public class FindPairsEqualGivenNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("pairs whose sum = 9 are : ");
        getPairs(arr, 9);
    }

    public static void getPairs(int[] arr, int sum) {
        //    problem is that we need to find pairs in a sorted array whose
        //    sum equals a given number
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if(arr[low] + arr[high] > sum)
                high--;
            else if (arr[low] + arr[high] < sum)
                low++;
            else if (arr[low] + arr[high] == sum){
                System.out.println("(" + arr[low] + ", " + arr[high] + ")");
                low++;
                high--;
            }
        }
    }

}
