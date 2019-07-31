package com.lhotse.core.team.array;

/**
 * This program will sort array using bubble sort algorithm.
 */
public class BubbleSort {
    public static void main(String[] arg) {
        int[] r = {5, 99,78,55,21,70,10, 4, 2, 85 };
        for(int i =0;i<r.length;i++) {
            for (int j = 1; j < r.length; j++) {
                if (r[j - 1] > r[j]) {
                    int temp = r[j];
                    r[j] = r[j - 1];
                    r[j - 1] = temp;
                }
            }
        }
        for(int m : r){
            System.out.print(m+" ");
        }
    }
}
