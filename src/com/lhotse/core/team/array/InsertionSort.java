package com.lhotse.core.team.array;

/**
 * This method will sort array using insertion sort algorithm .
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        for (int m = 0; m < ar.length; m++) {
            int smallest = ar[m];
            int index = m;
            for (int j = m + 1; j < ar.length; ++j) {
                if (smallest > ar[j]) {
                    smallest = ar[j];
                    index = j;
                }
            }

            int a = ar[index];
            for (int i = index-1 ; i >= 0; i--) {
                ar[i+1] = ar[i];
            }
            ar[m]= a;
            System.out.print(ar[m] + " ");
        }
    }
}
