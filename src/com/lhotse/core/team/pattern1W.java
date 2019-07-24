package com.lhotse.core.team;

/**
 * This program will print @
*                        @ @
 *                     @ @ @
 *                   @ @ @ @
 *                 @ @ @ @ @
 */
public class pattern1W {
    public static void main(String[] args) {
        pat1w(1, 5, 1);
    }

    /**
     * @param r This will print number of rows .
     * @param c This will print spaces(" ") in column .
     * @param z This will print @ in column .
     */
    public static void pat1w(int r, int c, int z) {
        int i = r;
        while (i <= 5) {
            i++;
            int j = c;
            while (j >= i) {
                System.out.print("  ");
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
