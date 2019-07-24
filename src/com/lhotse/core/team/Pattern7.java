package com.lhotse.core.team;

/**
 * This program will print  5
 *                          54
 *                          543
 *                          5432
*                           54321
 */

public class Pattern7 {
    public static void main(String[] args) {
        pat7(5, 5);
    }

    /**
     * @param row    It will give the number of rows .
     * @param column It will give the number of column .
     */
    public static void pat7(int row, int column) {
        for (int i = row; i >= 1; i--) {
            for (int j = column; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
