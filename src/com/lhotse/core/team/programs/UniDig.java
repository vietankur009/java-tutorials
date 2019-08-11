package com.lhotse.core.team.programs;

import java.util.HashSet;
import java.util.Set;

public class UniDig {
    public static int uDig(int input1) {
        Set<Integer> ar = new HashSet<>();
        while(input1!=0) {
            int el = input1%10;
            ar.add(el);
            input1 = input1 / 10;
            //System.out.println(ar);
        }
        int count = 0;
        for (int y : ar) {
            count++;
            //System.out.println(y);
        }
    return count;
    }

    public static void main(String[] arg){
        int x = uDig(226);
        System.out.println(x);
        //UniDig u = new UniDig();
        //System.out.println(u);
    }
}
