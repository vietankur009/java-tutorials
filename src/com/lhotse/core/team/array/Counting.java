package com.lhotse.core.team.array;

/**
 * This program will print the counting of an element .
 */
public class Counting {
    public static void main(String[] arg) {
        int[] a = {1, 2, 1, 3, 1, 5, 2, 3,5};
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1){
                int e = a[i];
                int count = 1;
                for (int j = i+1;j<a.length;j++){
                    if(a[j] != -1){
                        if(a[i] == a[j]){
                            count = count +1;
                            a[j] = -1;
                        }
                    }
                }
                System.out.println("element" +" "+ e +" " +"value"+" " + count);
            }
        }
    }
}
