package com.lhotse.core.team;

/**
 *  This program will print 5
 *                         44
 *                        333
 *                       2222
 *                      11111
 */
public class Pattern5 {
    public static void main(String[] args) {
        pat5(1,1);
    }

    /**
     *
     * @param row It will give the first row .
     * @param column It will give the first column .
     */
    public static void pat5(int row, int column) {
        for (int i = 5; i >= row; i--) {

            for (int j = i; j > column; j--) {
                System.out.print(" ");
            }

            for (int k = 5; k >= i; k--) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
