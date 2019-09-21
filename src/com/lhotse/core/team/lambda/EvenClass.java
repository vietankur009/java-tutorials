package com.lhotse.core.team.lambda;

public class EvenClass {

    public static void main(String... arg){
        EvenOrOdd even = (int a) -> (a%2)==0;
            System.out.println(even.e(8));
    }
}
