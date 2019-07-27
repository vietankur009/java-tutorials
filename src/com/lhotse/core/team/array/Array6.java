package com.lhotse.core.team.array;

public class Array6 {
    public static void main(String[] args) {
        int[] i = new int[]{4, 3, 2, 10, 12, 1, 5, 6};
        for (int m = 0; m < i.length; m++) {
            int smallest = i[0];
            int index = 0;
            for (int j = 1; j < i.length; j++) {
                if (i[j] < smallest) {
                    smallest = i[j];

                }
                index = j;
                int temp = i[index];
                i[index] = smallest;
                i[j] = temp;
               // index++;
            }
        }
        //System.out.print(smallest);
        for (int r = 0; r < i.length; r++) {
            System.out.print(i[r] + " ");
        }
    }
}
