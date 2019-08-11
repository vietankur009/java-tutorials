package com.lhotse.core.team.programs;

public class CountPrime {
    static int countInRange(int input1,int input2){
        int count = 0;
        int j;
        for( j = input1;j<=input2;j++) {
            for (int i = 2; i <= j ; i++) {
                if (j % i == 0 ) {
                    count =0;
                    break;
                }else{
                    count =1;
                }
            }
            if(count ==1)
                System.out.println(j);
        }
        return j;
    }

    public static void main(String[] arg){
        int x = countInRange(3,10);
        System.out.println(x);
    }
}
