package com.lhotse.core.team.lambda;

public class OddClass {

    public static void main(String... arg){
        EvenOrOdd odd = (int a) -> (a%2==0);
        System.out.println(odd.e(5));
    }
}
