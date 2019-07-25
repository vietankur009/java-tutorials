package com.lhotse.core.team.array;

/**
 * This method will print the array element one by one but in reverse order.
 */
public class Array2 {
    public static void main(String[] args) {
        ar2();
    }

    public static void ar2() {
        int[] i = new int[5];
        i[0] = 40;
        i[1] = 70;
        i[2] = 10;
        i[3] = 50;
        i[4] = 20;
        for (int j = 4; j < i.length && j>=0; j--) {
            System.out.print(i[j] + " ");
        }
    }
}
