package com.lhotse.core.team.array;

/**
 * This method will print the array element one by one but in reverse order.
 */
public class Array2 {
    public static void main(String[] args) {
        reverse();
    }

    public static void reverse() {
        int[] i = new int[]{40,70,10,50,20};
        int[] ar = new int[5];

        int n =0;
        for (int j = 4; j < i.length && j>=0; j--) {
            ar[n] = i[j];
            n++;
        }


        for (int t=0; t<ar.length ; t++){
            System.out.print(ar[t]+ " ");
        }
    }
}
