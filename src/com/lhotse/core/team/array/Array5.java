package com.lhotse.core.team.array;

public class Array5 {
    public static void main(String[] args) {
        sort();
    }

    public static void sort() {
        try {
            int[] ar = new int[]{10,38,50};
            System.out.println(ar[-4]);


        }catch (Exception e){
            System.out.println("Your index is wrong and if you call method e.getMessage then it will print the wrong index.");
        }finally {
            System.out.println("do not worry");
        }
    }
}
