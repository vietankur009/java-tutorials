package com.lhotse.core.team.innerClassPrograms;

/**
 * This class will be used to print a revesal Arrays structure.
 */
public class ArraysReversal {
    public static void main(String[] args) {

        try {
            /**
             * make a Array For reversal and fill the value in Arrays.
             *                      &
             * Taking a Second Blank Arrays & fill the seversal value in the blank Arrays.
             */
            int[] ar1 = new int[]{10, 5, 15, 7, 9, 21, 25, 35 ,40, 8, 1, 2};
            int[] ar2 = new int[ar1.length];
            /**
             * First loop is colling for blank Arrays Named is "ar2"
             * Make a Smallest Number for the Arrays One called "ar1"
             */
            for (int i = 0; i < ar2.length; i++) {
                int smallest = ar1[0];
                int index = 0;
                /**
                 * Second loop is swaping a value for another index.
                 */
                for (int j = 1; j < ar1.length; j++) {

                    /**
                     * Taking a condations for a Smallest value.
                     */
                    if (ar1[j] < smallest) {
                        smallest = ar1[j];
                        index = j;
                    }
                }
                ar1[index] = 99;
                ar2[i] = smallest;
                System.out.print(smallest + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is wrong and if you call method e.getMessage then it will print the wrong index.");
        } finally {
            System.out.println("do not worry");
        }
    }
}
