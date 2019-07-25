package com.lhotse.core.team.array;

/**
 * This method will print the array element one by one but in reverse order.
 */
public class Array2 {
    public static void main(String[] args) {
        reverse();
        byswap();
    }

    public static void reverse() {
        int[] i = new int[]{40, 70, 10, 50, 20};
        int[] ar = new int[5];

        int n = 0;
        for (int j = 4; j < i.length && j >= 0; j--) {
            ar[n] = i[j];
            n++;
        }

        for (int t = 0; t < ar.length; t++) {
            System.out.print(ar[t] + " ");

        }

        System.out.println(" ");
    }


    public static void byswap() {
        int[] m = new int[]{100, 70, 136, 50,28};
        int c = m.length-1;
        for(int n = m.length -1; n < m.length && n >= 0; n--){
            int temp = m[n];
            m[n] = m[n-c];
            m[n-c] = temp;
            c= c-2;
        }

        for (int r = 0; r < m.length; r++) {
            System.out.print(m[r] + " ");
        }
    }
}
