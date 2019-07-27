package com.lhotse.core.team.array;

/**
 * This program will sort the array.
 */
public class Array5 {
    public static void main(String[] args) {

        try {
            int[] ar1 = new int[]{71, 90, 60, 10, 55, 67, 50, 34, 87};
            int[] ar2 = new int[ar1.length];
            //System.out.println(ar1[-4]);

            for (int i = 0;i<ar2.length;i++){
                int smallest = ar1[0];
                int index = 0;
                for (int j = 1; j < ar1.length; j++) {
                    if (ar1[j] < smallest ) {
                        smallest = ar1[j];
                        index = j;
                    }
                }

                //System.out.println(smallest);
                ar1[index] = 99;
                ar2[i] = smallest;
                System.out.print(ar2[i] + " ");

            }
            /**
             * It will print the final sort array .
             */
            /*for (int t = 0; t < ar2.length; t++) {
                System.out.print(ar2[t] + " ");
            }*/

            /*System.out.println(" ");
            for (int t = 0; t < ar1.length; t++) {
                System.out.print(ar1[t] + " ");
            }*/
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is wrong and if you call method e.getMessage then it will print the wrong index.");
        } /*finally {
            System.out.println("do not worry");
        }*/
    }
}