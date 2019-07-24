package com.lhotse.core.team.ankit;

/**
 *
 * This class will be used to print a Middle Number Patten of pyramid structure.
 *   5
 *   5 4
 *   5 4 3
 *   5 4 3 2
 *   5 4 3 2 1
 */
public class NumberPattenTwo {
    public static void main (String... arg){

    }

    /**
     * This method will be used to print number patten of pyramid.
     */
    public static void printPyramid(){
        for (int i = 5; i >= 1; i = i - 1){
            for (int j = 5; j >= i; j = j - 1){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
