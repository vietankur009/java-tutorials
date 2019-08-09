package com.lhotse.core.team.programs;

public class CountPrime {
    static int countInRange(int input1,int input2){
        int count = 0;
        for(int i = input1;i>=input1 && i<=input2;i++){
            if(input2%i ==0 )
                count++;
        }
        return count;
    }

    public static void main(String[] arg){
        int x = countInRange(1,4);
        System.out.println(x);
    }
}
