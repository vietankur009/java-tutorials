package com.lhotse.core.team.array;

public class QuickSort {

    public static void partition(){
        int[] r = {2, 11, 5, 9, 1, 10, 4, 7};
        int pivot = r[r.length -1];
        System.out.print(pivot);
    }
    public static void main(String [] arg) {
        int[] r = {2, 11, 5, 9, 1, 10, 4, 7};
        //partition();
        int pivot = r[r.length -1];
        for(int i =0;i<r.length;i++){
            if(r[i]>pivot){
                for(int j =r.length-1;j>= i;j--){
                    if(r[j]<=pivot){
                        int temp = r[i];
                        r[i] = r[j];
                        r[j] =temp;
                    }
                }
            }
        }
        for(int x : r) {
            System.out.println(r[x]);
        }
    }
}