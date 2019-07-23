package com.lhotse.core.team;

public class pattern2W {
    public static void main(String[] args){
        int i = 1;
        while(i<= 5){
            i++;
            int j = 5;
            while(j>=i){
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k<i){
                System.out.print(" @");
                k++;
            }
            System.out.println(" ");
        }
    }
}
