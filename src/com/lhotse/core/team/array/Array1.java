package com.lhotse.core.team.array;

public class Array1 {
    public static void main(String[] args) {
        ar1();
    }

    public static void ar1() {
        int[] i = new int[5];
        i[0] = 40;
        i[1] = 70;
        i[2] = 10;
        i[3] = 50;
        i[4] = 20;
        for (int j = 0; j < i.length; j++) {
            System.out.print(i[j] + " ");
            if(i[j]>i[0]){
                System.out.print("");
            }
        }


    }
}


