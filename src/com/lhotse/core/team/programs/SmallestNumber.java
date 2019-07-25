package com.lhotse.core.team.programs;

/**
 * Created by Lhotse Team on 7/24/2019.
 */
public class SmallestNumber {
    public static void main(String... arg) {

        int a[] = new int[]{23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int y = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] < y) {
                y = a[i];
            }
        }

        System.out.println("Smallest Number in a given array is : " + y);
    }
}
