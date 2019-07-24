package com.lhotse.core.team;

/**
 * This program will print tables from 1 to 10 .
 */
public class Table {
    public static void main(String[] args) {
        tab(10, 10);
    }

    /**
     *
     * @param rowNum It will give the max row number .
     * @param columnNum It will print values in the column.
     */
    public static void tab(int rowNum, int columnNum) {
        for (int i = 1; i <= rowNum; i++) {
            for (int j = 1; j <= columnNum; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println(" ");
        }
    }
}
