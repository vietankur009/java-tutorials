package com.lhotse.core.team.programs;

/**
 * Created by Lhotse Team on 7/25/2019.
 */
public class ReversalArrays {
    public static void main(String... arg) {
        int[] y = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int j = 0; j < y.length; j = j + 1) {
            System.out.print(y[j] + " ");

        }
        System.out.println(" ");
        System.out.println("================*Reversel program*================");

        for (int a = y.length - 1; a >= 0; a = a - 1) {
            System.out.print(y[a] + " ");

        }


    }
}
