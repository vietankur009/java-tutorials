package com.lhotse.core.team.ankit;


public class Test7 {
    public static void main(String... arg){
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
