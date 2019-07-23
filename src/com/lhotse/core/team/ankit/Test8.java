package com.lhotse.core.team.ankit;

/**
 * Created by Lhotse Team on 7/23/2019.
 */
public class Test8 {
    public static void main (String... arg){
        for (int i = 5; i >= 1; i = i - 1){
            for (int j = 5; j >= i; j = j - 1){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
