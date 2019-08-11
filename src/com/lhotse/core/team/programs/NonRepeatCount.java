package com.lhotse.core.team.programs;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class NonRepeatCount {
    static int nonRepeatCou(int input1) {
        int[] ar1 = new int[10];
        List<Integer> al = new ArrayList<>();
        while (input1 != 0) {
            int re = input1 % 10;
            input1 = input1 / 10;
            al.add(re);
        }
        //System.out.println(al);
        Integer[] ar = new Integer[al.size()];
        ar = al.toArray(ar);
        /*for (int y : ar) {
            System.out.print(y + " ");
        }*/

        //System.out.println(" ");

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    ar1[i]++;
                }
            }
        }

        int count = 0;
        for (int r = 0; r < ar.length; r++) {
            if (ar1[r] == 1) {
                count++;
            }
        }


        return count;
    }

    public static void main(String[] arg) {
        int x = nonRepeatCou(123456789);
        System.out.println(x);
    }

}
