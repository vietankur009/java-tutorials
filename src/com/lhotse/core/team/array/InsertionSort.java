package com.lhotse.core.team.array;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        for (int m = 0; m < ar.length-1; m++) {
            int index  = m;
            if(ar[m+1] < ar[m]){
                index = m+1;
            }
            int a = ar[index];
            for(int j = index-1;j>=0;j--){
                ar[j+1] = ar[j];
            }
            ar[m] = a;
            System.out.print(ar[m] + " ");
        }
    }
}
