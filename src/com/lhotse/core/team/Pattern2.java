package com.lhotse.core.team;

/**
 * This program will print  1
 *                         1 2
 *                        1 2 3
 *                       1 2 3 4
 *                      1 2 3 4 5
 */
public class Pattern2 {
    public static void main(String[] args) {
        pat2(5);
    }

    /**
     *
     * @param rowNum It will give the number of rows .
     */
    public static void pat2(int rowNum) {
        for (int i = 1; i <= rowNum; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println(" ");
        }
    }
}
