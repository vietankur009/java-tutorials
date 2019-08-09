package com.lhotse.core.team.programs;

public class Digit {
    static int dig(int input1){
        int count =0 ;
        while(input1!=0){
            input1 = input1/10;
            count++;
        }
        return count;
    }

    public static void main(String[] arg){
        int x = dig(67);
        System.out.println(x);
    }
}
