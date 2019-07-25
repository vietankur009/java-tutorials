
package com.lhotse.core.team.array;

public class Array4 {
    public static void main(String[] args) {
        ar4();
    }

    public static void ar4() {
        int[] a = new int[]{10, 1, 12, 5, 6};
        int largest = a[0];
        int secLarge = a[4];
        for (int j = 1; j < a.length; j++) {

            if (a[j] > largest) {
                largest = a[j];
            }
        }
        for (int i = 0;i<a.length -1;i++){
            if (a[i] < largest&& a[i] >a[4]){
                secLarge = a[i];
            }
        }
        System.out.println(largest);
        System.out.println(secLarge);

    }
}

