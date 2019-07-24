package com.lhotse.core.team;

/**
 * This will print 1
 *                 2 3
 *                 4 5 6
 *                 7 8 9 10
 *                 11 12 13 14 15
 */
public class Pattern6 {
    public static void main(String[] args) {
        pat6(0);
    }

    /**
     * @param n It will print the consecutive number in every row.
     */
    public static void pat6(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                n++;
                System.out.print(n + " ");
            }
            System.out.println(" ");
        }
    }
}
