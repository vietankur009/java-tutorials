package com.lhotse.core.team.programs;

public class Prime {
    public static int primeNum(int input1){
        int t =2;
        for (int n = 2;n<input1/2;n++){
            if(input1%n==0)
                t = 1;
                break;
        }
        return t;
    }

    public static void main(String[] arg){
        int s = primeNum(3);
        System.out.println(s);
    }
}
