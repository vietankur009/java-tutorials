package com.lhotse.core.team.array;

/**
 * This method will print the array element one by one but in reverse order.
 */
public class Array2 {
    public static void main(String[] args) {
        int[] i = new int[]{40, 70, 10, 50, 20};
        int[] m = new int[]{100, 70, 136, 50, 28};
        int[] t = new int[]{100, 70, 15, 40, 28};
        reverse(i);
        byswap1(m);
        byswap2(t);
    }

    public static void reverse(int[] x) {

        int[] ar = new int[5];

        int n = 0;
        for (int j = 4; j < x.length && j >= 0; j--) {
            ar[n] = x[j];
            n++;
        }

        for (int t = 0; t < ar.length; t++) {
            System.out.print(ar[t] + " ");

        }

        System.out.println(" ");
    }


    public static void byswap1(int[] z) {

        int l = z.length;
        for (int n = l - 1; n > l / 2; n--) {
            int temp = z[l - n - 1];
            z[l - n - 1] = z[n];
            z[n] = temp;
        }

        for (int r = 0; r < z.length; r++) {
            System.out.print(z[r] + " ");
        }

        System.out.println(" ");
    }


    public static void byswap2(int[] v) {

        int l = v.length;
        for (int n = 0; n < l / 2; n++) {
            int temp = v[n];
            v[n] = v[l - n - 1];
            v[l - n - 1] = temp;
        }

        for (int r = 0; r < v.length; r++) {
            System.out.print(v[r] + " ");
        }
    }
}
