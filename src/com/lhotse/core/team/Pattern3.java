package com.lhotse.core.team;

/**
 * This program will print :    1
 *                             12
 *                            123
 *                           1234
 *                          12345
 */
public class Pattern3 {
    public static void main(String[] args) {
        pat3(5);
    }

    /**
     *
     * @param rowNum It will give number of rows .
     */
    public static void pat3(int rowNum) {
        for (int i = 1; i <= rowNum; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }
}
