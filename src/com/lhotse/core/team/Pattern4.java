package com.lhotse.core.team;

public class Pattern4 {
    public static void main(String[] args){
        for(int i = 1;i <=5;i++){

            for(int j = 5; j>i;j-- ) {
                System.out.print(" ");
            }

            for(int k =i; k>=1;k-- ){
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }
}
