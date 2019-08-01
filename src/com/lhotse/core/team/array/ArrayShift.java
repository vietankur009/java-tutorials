package com.lhotse.core.team.array;

/**
 * This will shift array towards right side in a circular manner.
 */
public class ArrayShift {
    public static void main(String[] arg) {
        int[] ar= new int[]{4, 3, 2, 10, 12, 1, 5, 6};
            int a = ar[ar.length - 1];
            for (int i = ar.length - 2; i >= 0; i--) {
                ar[i+1] = ar[i];
            }
            ar[0]= a;

        for (int t = 0; t < ar.length; t++) {
            System.out.print(ar[t] + " ");
        }
    }
}
