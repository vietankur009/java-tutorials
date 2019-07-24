package com.lhotse.core.team;

/**
 * This program will print 1
 *                        21
 *                       321
 *                      4321
 *                     54321
 */

public class Pattern4 {
    public static void main(String[] args) {
        pat4(5);
    }

    /**
     *
     * @param rowNum It will give the number of rows.
     */
    public static void pat4(int rowNum) {

        for (int i = 1; i <= rowNum; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }
}
