package com.lhotse.core.team.programs;

public class SumEvenOrOddDigit {
    public static int sumEvenOrOddDigit(int input1, String input2){
        int [] ar = new int[10];
        int i = 0;
        while (input1 != 0) {
            int re = input1 % 10;
            ar[i] = re;
            input1 = input1 / 10;
            i++;
        }

        int count1 = 0;
        int count2 = 0;
        for(int j =0;j<ar.length;j++){
            if(j%2==0) {
                count1 = count1 + ar[j];
            }else{
                count2 = count2 + ar[j];
            }
        }


        if(input2 =="even")
            return count1;
        else
            return count2;
    }

    public static void main(String[] arg){
        int z = sumEvenOrOddDigit(3857434,"odd");
        System.out.println(z);
    }
}
