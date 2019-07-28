package com.lhotse.core.team.innerClassPrograms;

/**
 * This class will be used to print a revesal Arrays structure.
 *
 */
public class ArraysReversalTwo {
    public static void main(String... arg) {
        /**
         * Arrays Revers without using third varval.
         * make a Array For reversal and fill the value in Arrays.
         */
        int[] arr = new int[]{10, 5, 15, 7, 9, 21, 25};
        /**
         * Print the value of Arrays.
         */
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("===========================");
        /**
         * Second Loop is Swaping the value for the Arrays.
         */
        for (int i = 0; i < arr.length / 2 ; i = i + 1){
            int x = arr[i];
            arr[i] = arr[arr.length-1 - i] ;
            arr[arr.length - 1 - i] = x;
        }
        /**
         * Third loop is fill the value in the Arrays.
         */
        for  (int i = 0; i < arr.length; i = i + 1){
            System.out.print(arr[i] + " ");
        }
    }
}
