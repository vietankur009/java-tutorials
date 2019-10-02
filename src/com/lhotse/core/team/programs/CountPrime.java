package com.lhotse.core.team.programs;

public class CountPrime {
    static int countInRange(int input1, int input2) {
        int count = 0;
        for (int j = input1; j <= input2; j++) {
            if (j / 2 < 2) {
                count++;
            }
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    break;
                }
                if (i == j / 2) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] arg) {
        int x = countInRange(2, 10);
        System.out.println(x);
    }
}