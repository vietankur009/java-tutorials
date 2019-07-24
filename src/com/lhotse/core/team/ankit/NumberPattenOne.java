package com.lhotse.core.team.ankit;

/**
 * This class will be used to print a number Patten of pyramid structure.
 *
 *          1
 *         12
 *        123
 *       1234
 *      12345
 */
public class NumberPattenOne {
    public static void main(String... arg){
        printPyramid(5,4);

    }

    /**
     * This method will be used to print pyramid.
     *
     * @param rows it will tell how many long pyramid I need.
     * @param column it will tell how many column should be there in pyramid.
     */

    public static void printPyramid(int rows, int column){
        for(int r = 1; r <= rows; r = r + 1){
            for(int s = column; s >= r; s = s - 1){
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c = c +1){
                System.out.print(c);
            }
            System.out.println("");
        }
    }
}
