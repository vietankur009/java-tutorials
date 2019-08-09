package com.lhotse.core.team.programs;

public class Fibonacci {
    public static int fibonacciSe(int input1) {
        int a = 0;
        int b =1;
        int c;
        for (int n = 1; n <= input1-1; n++) {
            c = b+a;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] arg){
        int x = fibonacciSe(7);
        System.out.println(x);
    }
}
