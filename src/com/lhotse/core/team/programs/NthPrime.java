package com.lhotse.core.team.programs;

public class NthPrime {
    public static int nPrime(int input1){
        int num = 0;
        for (int n = 1;n<=input1;n++){
            if(num%n==0)
                num++;
        }
        return 2;
    }

    public static void main(String[] arg){
        int s = nPrime(4);
        System.out.println(s);
    }

}

