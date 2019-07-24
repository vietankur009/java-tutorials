package com.lhotse.core.team;

/**
 * This program will print @
 *                        @ @
 *                       @ @ @
 *                      @ @ @ @
 *                     @ @ @ @ @
 */
public class pattern2W {
    public static void main(String[] args) {
        pat2w(1, 5, 1);
    }

    /**
     * @param r It will print number of rows.
     * @param c It will print space in column .
     * @param z It will print @ in column .
     */
    public static void pat2w(int r, int c, int z) {
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
                System.out.print(" @");
                k++;
            }
            System.out.println(" ");
        }
    }
}
