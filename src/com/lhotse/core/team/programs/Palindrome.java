package com.lhotse.core.team.programs;

public class Palindrome {
    static int palin(int input1){
        int reverse = 0;
        while(input1!=0){
            int re = input1%10;
            input1 = input1/10;
            reverse = reverse*10 + re;
            System.out.println(reverse);
        }
        if(input1 ==reverse)
            return 2;
        else
            return 1;
    }

    public static void main(String[] arg){
        int x = palin(525);
        System.out.println(x);
    }
}
