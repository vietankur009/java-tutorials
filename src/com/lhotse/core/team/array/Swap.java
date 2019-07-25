package com.lhotse.core.team.array;

public class Swap {
    public static void main(String[] args){
        swapping(4,5);
    }

    public static void swapping(int a , int b){
        int x = a;
        int y = b;
        int z ;
        z = y;
        y = x;
        x =z;

        System.out.print(x + " " + y);

    }
}
