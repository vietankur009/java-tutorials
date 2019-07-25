package com.lhotse.core.team.array;

public class Array5 {
    public static void main(String[] args) {
        sort();
    }

    public static void sort() {
        try {
            int[] ar = new int[]{10,38,50};



        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("do not worry");
        }
    }
}
