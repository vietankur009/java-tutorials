package com.lhotse.core.team.programs;

public class Fibonacci {
    public static void fibonacciSe(int input1) {
        int a = 0;
        int b =1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int n = 1; n <= input1-1; n++) {
            c = b+a;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    public static void main(String[] arg){
        fibonacciSe(7);
    }
}
