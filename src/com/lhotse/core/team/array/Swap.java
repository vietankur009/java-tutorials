package com.lhotse.core.team.array;

/**
 * This program will swap two numbers using third variable .
 */
public class Swap {
    public static void main(String[] args){
        swapping(4,5);
    }

    /**
     * @param a It is the first number .
     * @param b It is the second number.
     */
    public static void swapping(int a , int b){
        int x = a;
        int y = b;
        int z ;
        z = y;
        y = x;
        x =z;

        System.out.print(x + " " + y);

    }
}
