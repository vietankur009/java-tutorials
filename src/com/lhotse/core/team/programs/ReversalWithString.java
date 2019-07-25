package com.lhotse.core.team.programs;

/**
 * Created by Lhotse Team on 7/24/2019.
 */
public class ReversalWithString {
    public static void main(String... arg) {
        String x = "Ankit Is Learning Java";
        String[] y = x.split(" ");
        for (int j = 0; j < y.length; j = j + 1) {
            System.out.println(y[j]);
        }
        System.out.println("================*Reversel program*================");
        for (int a = y.length - 1; a >= 0; a = a - 1) {
            System.out.print(y[a]);
        }
        System.out.println(" ");
        System.out.println("===============*reversel charractor wise*==================");
        String[] c = x.split("");
        for (int f = c.length - 1; f >= 0; f = f - 1) {
            System.out.print(c[f]);
        }

    }
}
