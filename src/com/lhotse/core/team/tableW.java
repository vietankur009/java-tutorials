package com.lhotse.core.team;

/**
 * This method will print table from 1 to 10;
 */
public class tableW {
    public static void main(String[] args) {
        tabw(0, 1);
    }

    /**
     *
     * @param row It will print row .
     * @param column It will print column .
     */
    public static void tabw(int row, int column) {
        int i = row;
        while (i < 10) {
            i++;
            int j = column;
            while (j <= 10) {
                System.out.print(i * j + " " + "\t");
                j++;
            }
            System.out.println(" ");
        }
    }
}
