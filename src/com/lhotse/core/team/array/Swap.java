package com.lhotse.core.team.array;

/**
 * This program will swap two numbers using third variable .
 */
public class Swap {
    public static void main(String[] args){
        swapping1(4,5);
        swapping2(4,5);
    }

    /**
     * @param a It is the first number .
     * @param b It is the second number.
     */
    public static void swapping1(int a , int b){
        int x = a;
        int y = b;
        int z ;
        z = y;
        y = x;
        x =z;

        System.out.println(x + " " + y);
    }

    public static void swapping2(int m , int n){
        int x = m;
        int y = n;

        x = x+y;
        y = x-y;
        System.out.println((x-y) + " " + y);
    }
}
