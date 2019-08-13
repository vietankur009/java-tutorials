package com.lhotse.core.team.programs;

public class Pin {
    static int pinGenerate(int input1, int input2, int input3) {
        int ar1[] = new int[3];
        int ar2[] = new int[3];
        int ar3[] = new int[3];
        int i = 0;
        while (input1 != 0 && input2 != 0 && input3 != 0) {
            int re1 = input1 % 10;
            ar1[i] = re1;
            input1 = input1 / 10;

            int re2 = input2 % 10;
            ar2[i] = re2;
            input2 = input2 / 10;

            int re3 = input3 % 10;
            ar3[i] = re3;
            input3 = input3 / 10;

            i++;
        }
        int sn1 = ar1[0];
        int sn2 = ar2[0];
        int sn3 = ar3[0];
        int ln1 = ar1[0];
        int ln2 = ar2[0];
        int ln3 = ar3[0];
        for (int x = 1; x < ar1.length; x++) {
            if (ar1[x] < sn1) {
                sn1 = ar1[x];
            }

            if (ar2[x] < sn2) {
                sn2 = ar2[x];
            }

            if (ar3[x] < sn3) {
                sn3 = ar3[x];
            }

            if (ar1[x] > ln1) {
                ln1 = ar1[x];
            }

            if (ar2[x] > ln2) {
                ln2 = ar2[x];
            }

            if (ar3[x] > ln3) {
                ln3 = ar3[x];
            }
        }

        int large = 0;
        if (ln1 > ln2 && ln1 > ln3) {
            large = ln1;
        } else if (ln2 > ln1 && ln2 > ln3) {
            large = ln2;
        } else {
            large = ln3;
        }

        //System.out.println(ln1);
        int pin = 0;
        pin = pin * 1 + large;
        pin = pin * 10 + sn3;
        pin = pin * 10 + sn2;
        pin = pin * 10 + sn1;

        return pin;
    }

    public static void main(String[] arg) {
        int v = pinGenerate(462, 573, 310);
        System.out.print(v);
    }
}
