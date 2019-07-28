package com.lhotse.core.team.array;

/**
 * This will sort array without using another array.
 */
public class Array6 {
    public static void main(String[] args) {
        int[] i = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        for (int m = 0; m < i.length; m++) {
            int smallest = i[m];
            int index = m;
            for (int j = m + 1; j < i.length; ++j) {
                if (smallest > i[j]) {
                    smallest = i[j];
                    index = j;
                }
            }

            int temp = i[m];
            i[m] = i[index];
            i[index] = temp;
            System.out.print(i[m] + " ");
        }
    }
}
