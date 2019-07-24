package com.lhotse.core.team;

/**
 * This program will print @
 *                       @ @
 *                     @ @ @
 *                   @ @ @ @
 *                 @ @ @ @ @
 */
public class Pattern1 {
    public static void main(String[] args) {
        pat1(5);
    }

    /**
     * @param rowNum It will give the number of rows.
     */
    public static void pat1(int rowNum) {
        for (int i = 1; i <= rowNum; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(" @");
            }
            System.out.println(" ");
        }
    }
}
