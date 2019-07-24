package com.lhotse.core.team.array;

/**
 * This program will print the smallest number of an array .
 */
public class Array1 {
    public static void main(String[] args) {
        ar1();
    }

    public static void ar1() {
        int[] i = new int[]{40, 70, 10, 50, 20};
        int smallest = i[0];
        for (int j = 1; j < i.length; j++) {

            if (i[j] < smallest) {
                smallest = i[j];
            }
            System.out.print(smallest + " ");
        }
        System.out.println(" ");
        System.out.print(smallest);

    }
}


