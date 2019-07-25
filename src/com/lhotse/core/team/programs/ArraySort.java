package com.lhotse.core.team.programs;

/**
 * Created by Lhotse Team on 7/24/2019.
 */
public class ArraySort {
    public static void main(String... arg){
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Array before reverse:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int x = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = x;
        }
        System.out.println("\nArray after reverse:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
