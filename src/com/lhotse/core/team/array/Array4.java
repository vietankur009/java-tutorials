package com.lhotse.core.team.array;

/**
 * This program will print the largest and the second largest number in an array.
 */

public class Array4 {
    public static void main(String[] args) {
        ar4();
    }

    public static void ar4() {
        int[] a = new int[]{10, 1, 12, 5, 6};
        int largest = a[0];
        int secLarge = a[4];
        /**
         * This loop will print the largest number .
         */
        for (int j = 1; j < a.length; j++) {

            if (a[j] > largest) {
                largest = a[j];
            }
        }
        /**
         * This loop will print the second largest number.
         */
        try {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < largest && a[i] > a[4]) {
                    secLarge = a[i];
                }
            }
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("You have take index larger than the array index");
        } finally {
            System.out.println("No tension,Exception is here.");
        }
        System.out.println(largest);
        System.out.println(secLarge);

    }
}

