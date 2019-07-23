package com.lhotse.core.team;

public class tableW {
    public static void main(String[] args){
        int n = 1;
        int i = 1;
        while(i<=10){
            i++;
            int j = 1;
            while(j<=10){
                System.out.print(n*j + " ");
                j++;
            }
            n++;
            System.out.println(" ");
        }
    }
}
