package com.lhotse.core.team.programs;

public class SumOfOddDigit {
    public static int sumOddDigit(int input1){
        int [] ar = new int[10];
        int i = 0;
        while (input1 != 0) {
            int re = input1 % 10;
            ar[i] = re;
            input1 = input1 / 10;
            i++;
        }

        int count = 0;
        for(int j =0;j<ar.length;j++){
            if(j%2!=0) {
                count = count + ar[j];
            }
        }

        return count;
    }

    public static void main(String[] arg){
        int z = sumOddDigit(3857434);
        System.out.println(z);
    }
}
