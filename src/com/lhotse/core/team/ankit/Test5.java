package com.lhotse.core.team.ankit;

/**
 * Created by Lhotse Team on 7/22/2019.
 */
public class Test5 {
    public static void main(String... arg){
        for(int r = 1; r <= 5; r = r + 1){
            for(int s = 4; s >= r; s = s - 1){
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c = c +1){
                System.out.print(c +" ");
            }
            System.out.println("");
        }

    }
}
