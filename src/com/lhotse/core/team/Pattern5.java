package com.lhotse.core.team;

public class Pattern5 {
    public static void main(String[] args){
        for(int i = 5;i >=1;i--){

            for(int j = i; j>1;j-- ){
                System.out.print(" ");
            }

            for(int k =5; k>=i;k--){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
