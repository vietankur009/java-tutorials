package com.lhotse.core.team.ankit;

/**
 * This class will be used to print a Middle Number Patten of pyramid structure.
 *
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 *
 *
 */
public class NumaricalPatten {
    public static void main(String... arg){
       printPyramid();
    }

    /**
     * This method will be used to print number patten of pyramid.
     *
     */
    public static void printPyramid(){
        int n = 0;
        for(int i = 1;i <= 5; i= i + 1){
            for(int j = 1; j <= i; j= j + 1) {
                n = n + 1;
                System.out.print(n + " ");
            }
            System.out.println(" ");
        }
    }
}
