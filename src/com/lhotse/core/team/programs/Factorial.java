package com.lhotse.core.team.programs;

public class Factorial {
    public static int factorialNum(int input1){
        for(int n =input1-1;n>0;n--){
            input1 = input1*n;
        }
        return input1;
    }

    public static void main(String[] arg){
        int x = factorialNum(5);
        System.out.println(x);
    }
}
