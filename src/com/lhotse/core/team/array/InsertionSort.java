package com.lhotse.core.team.array;

/**
 * This program will sort array using insertion algorithm.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = {4, 3, 2, 10, 12, 1, 5, 6};
        for (int m = 0; m < ar.length; m++) {
            int index = m;
            int a = ar[m];
            for (int j = m - 1; j >= 0; j--) {
                if (a < ar[j]) {
                    ar[m] = ar[j];
                    index = j;
                    ar[index] = a;
                }else {
                    break;
                }
                System.out.print(ar[index] + " ");
            }
            //ar[m] = a;
            System.out.print(ar[m] + " ");
        }

        /*for (int k = 0; k < ar.length; k++) {
            System.out.print(ar[k] + " ");
        }*/

       /* for(int i=0;i<a.length;i++)
        {
            int j = i;

            //i is not the first element
            while(j>0)
            {
                //not in order
                if(a[j-1] > a[j])
                {
                    //swapping
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
                //in order
                else
                {
                    break;
                }
                j--;
            }
        }

        for(int x : a)
        {
            System.out.print(x + " ");
        }
*/

        /*for (int j = m; j > 0; j--) {
            if (ar[j - 1] > ar[j]) {
                int temp = ar[j - 1];
                ar[j - 1] = ar[j];
                ar[j] = temp;
            } else {
                break;
            }
        }*/
    }
}

