package com.lhotse.core.team.TestingPack3;

public class BubSort {

    public static void main(String... arg) {
        int[] ar = {4, 2, 49, 56, 1, 7, 29};
        for (int i = 0; i < ar.length ; i++) {
            for (int j =1; j < ar.length -i; j++) {
                if (ar[j-1] > ar[j]) {
                    int temp = ar[j -1];
                    ar[j-1] = ar[j ];
                    ar[j ] = temp;
                }
            }
        }
        for (int p : ar) {
            System.out.print(p+" ");
        }
    }
}
