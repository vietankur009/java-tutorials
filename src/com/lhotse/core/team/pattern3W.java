package com.lhotse.core.team;

/**
 * This program will print 1
 *                        12
 *                       123
 *                      1234
 *                     12345

 */
public class pattern3W {
    public static void main(String[] args) {
        pat3w(1, 5, 1);
    }

    public static void pat3w(int r, int c, int z) {
        int i = r;
        while (i <= 5) {
            i++;
            int j = c;
            while (j >= i) {
                System.out.print(" ");
                j--;
            }
            int k = z;
            while (k < i) {
                System.out.print(k);
                k++;
            }
            System.out.println(" ");
        }
    }
}
