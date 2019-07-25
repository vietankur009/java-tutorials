package com.lhotse.core.team.programs;

/**
 * Created by Lhotse Team on 7/24/2019.
 */
public class TopTwoNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 2, 6, 7, 2, 5, 8};
        int max = 0;
        int secondMax = 0;

        for (int i : arr)
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i < secondMax)
                secondMax = i;

        System.out.println("Max: " + max + " : " + " Second Max: " + secondMax);
    }

}

