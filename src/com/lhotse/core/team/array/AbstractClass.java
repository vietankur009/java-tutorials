package com.lhotse.core.team.array;

abstract class AbstractClass {
    public void sn(){
        int[] i = new int[]{40, 70, 10, 50, 20};
        int smallest = i[0];
        for (int j = 1; j < i.length; j++) {

            if (i[j] < smallest) {
                smallest = i[j];
            }
            //System.out.print(smallest + " ");
        }
        System.out.println(" ");
        System.out.print(smallest);
    }

    public void ln() {
        int[] i = new int[]{40, 70, 10, 50, 20};
        int largest = i[0];
        for (int j = 1; j < i.length; j++) {

            if (i[j] > largest) {
                largest = i[j];
            }
            //System.out.print(largest + " ");
        }
        System.out.println(" ");
        System.out.print(largest);

    }
}
