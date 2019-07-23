package com.lhotse.core.team.ankit;


public class Test {
    public static void main(String... arg){
        for(int r = 1; r <= 5; r = r + 1){
            for(int s = 4; s >= r; s = s - 1){
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c = c +1){
                System.out.print(c);
            }
            System.out.println("");
        }

    }
}
