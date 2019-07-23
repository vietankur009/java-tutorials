package com.lhotse.core.team.ankit;

/**
 * Created by Lhotse Team on 7/23/2019.
 */
public class Test10 {
    public static void main (String... arg){
        for (int i = 1; i <= 5; i = i + 1){
            for (int j = 5; j >= i; j = j - 1){
                System.out.print(i + " ");
            }
            for (int j = 5; j >= i; j = j - 1){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
