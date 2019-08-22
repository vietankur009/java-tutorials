package com.lhotse.core.team.programs;

public class NthPrime {
    public static int nPrime(int input1){
        int []ar = new int[input1];
        int x =0;
        int c = 0;
        for (int n = 1;n<=1000;n++){
            for(int j = 2;j<1000;j++){
                if(n%j==0){
                    c++;
                }
            }
            if(c==0){
                ar[x] =n;
                x++;
            }
        }

        return ar[input1-1];
    }

    public static void main(String[] arg){
        int s = nPrime(4);
        System.out.println(s);
    }

}

