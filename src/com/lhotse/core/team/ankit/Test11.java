package com.lhotse.core.team.ankit;

/**
 * This class will be used to print Table of 1 to 10 ;
 *
 */
public class Test11 {
    public static void main (String... arg){
        printTable();
    }

    /**
     * This method will be used to print Multiple table of mathes.
     */
    public static void printTable(){
        for (int i = 1; i <= 10; i = i + 1){
            for (int x = 1; x <= 10; x = x + 1){
                System.out.print(i + " * " + x + " = " +  i * x + "\t");
            }
            System.out.println(" ");
        }
    }
}
