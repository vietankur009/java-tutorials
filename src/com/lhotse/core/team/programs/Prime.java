package com.lhotse.core.team.programs;

public class Prime {
    public static int primeNum(int input1){

        for (int n = 2;n<input1;n++){
            if(input1%n==0)
                return 1;
        }
        return 2;
    }

    public static void main(String[] arg){
        int s = primeNum(18);
        System.out.println(s);
    }
}
