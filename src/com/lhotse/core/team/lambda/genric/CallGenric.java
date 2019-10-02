package com.lhotse.core.team.lambda.genric;

public class CallGenric {

    public static void main(String... arg){
        genInterface<Integer> gi = n -> {

            int result = 1;
            for(int i = 2;i<=n;i++){
                result = i*result;
            }
            return result;
        };

        System.out.println(gi.func(5));
    }
}
