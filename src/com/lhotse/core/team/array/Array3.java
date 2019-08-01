package com.lhotse.core.team.array;

/**
 * This method will print the largest element of an array.
 */
public class Array3 {
    public static void main(String[] args) {
        ar3();
    }

    public static void ar3() {
        int[] i = new int[]{40, 70, 10, 50, 20};
        int largest = i[0];
        for (int j = 1; j < i.length; j++) {

            if (i[j] > largest) {
                largest = i[j];
            }
            System.out.print(largest + " ");
        }
        System.out.println(" ");
        System.out.print(largest);

    }
}
