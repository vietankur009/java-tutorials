package com.lhotse.core.team.ankit;

/**
 * This class will be used to print a Middle Number Patten of pyramid structure.
 *
 * 5 4 3 2 1
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 *
 */
public class ReverseNumber {
    public static void main (String... arg){
        printPyramid(5,5);
    }

    /**
     * This method will be used to print number patten of pyramid.
     *
     * @param rows it will tell how many long pyramid I need.
     * @param column it will tell how many column should be there in pyramid.
     */

    public static void printPyramid(int rows, int column){
        for (int i = 1; i <= rows; i = i + 1){
            for (int j = column; j >= i; j = j - 1){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
