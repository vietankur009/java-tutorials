package com.lhotse.core.team.sprint;

public class Pattern {
    public static void pattern(int a){
        for(int i=1;i<=a;i++){
            for(int j = a-1;j>=i;j--){
                System.out.print("  ");
            }

            for(int k =1;k<=i;k++){
                System.out.print(i+" ");
            }

            System.out.println("");
        }
    }

    public static void main(String[] arg){
        pattern(8);
    }
}
