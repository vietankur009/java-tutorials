package com.lhotse.core.team.ankit;

/**
 * This class will be used to print a pramid structure.
 *      *
 *     **
 *    ***
 *   ****
 */
public class NumberPattern {
    public static void main(String... arg) {

        printPyramid(9, 8);
    }

    /**
     * This method will be used to print pyramid.
     *
     * @param numberOfRows    it will tell how many long pyramid I need.
     * @param numberOfColumns it will tell how many column should be there in pyramid.
     */
    public static void printPyramid(int numberOfRows, int numberOfColumns) {
        for (int r = 1; r <= numberOfRows; r = r + 1) {
            for (int s = numberOfColumns; s >= r; s = s - 1) {
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c = c + 1) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }

}
