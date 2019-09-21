package com.lhotse.core.team.lambda;

public class Factorial {

    public static void main(String... arg) {
        OnePara fac = (a) -> {
            int c =a-1;
            while(c>0){
                a = a*c;
                c--;
            }
            return a;
        };
        System.out.println(fac.add(5));
    }
}
