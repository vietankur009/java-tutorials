package com.lhotse.core.team;

public class Table {
    public static void main(String[] args){
        int n = 1;
        for(int i = 1;i <=10;i++){

            for(int j = 1; j<=10;j++ ) {
                int x  = (n*j);
                System.out.print(n+" "+"*"+" "+j+" "+"="+" "+ n*j+"  ");
            }
            n = n+1;
            System.out.println(" ");
        }
    }
}
