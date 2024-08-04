package org.datastructuresandalgorithms.arrays;

public class FindCommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7, 9, 11};
        int[] arr2 = {4, 6, 8, 9, 12};
        System.out.println("intersections between two arrays are: ");
        findIntersection(arr1, arr2);
    }
    public static void findIntersection(int[] arr1, int[] arr2) {
//        the Beginner way
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if(arr1[i] == arr2[j])
//                    System.out.println("number " + arr1[i]);
//            }
//        }
//        this is a bad approach as time Complexity is O(m*n)
//        where m is arr1 size, n is arr2 size
        ////////////////////////////////////////////////////////
//        the better way
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                System.out.println("number is " + arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }
        }
    }
//    this approach is better as it has a time complexity of O(m+n)
//    but it only works on sorted arrays
}
