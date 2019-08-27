package com.lhotse.core.team.programs;

public class NthPrime {
    public static int nPrime(int input1) {
        int c = 0;
        int num = 0;
        for (int i = 2; i < 1000; i++) {
            if (i / 2 < 2) {
                c++;
            }
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i / 2) {
                    c++;
                }
            }
            if(c==input1){
                num = i;
                break;
            }
        }
        return num;
    }

    public static void main(String[] arg) {
        int s = nPrime(5);
        System.out.println(s);
    }

}

