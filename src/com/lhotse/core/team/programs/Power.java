package com.lhotse.core.team.programs;

public class Power {

    public static long force(int x, int y) {
        long t = 1;
        while (y >= 0) {
            t = t * x;
            y--;
        }
        long b = t % 10;
        return b;
    }

    public static void main(String... arg) {
        long v = force(23, 41);
        System.out.println(v);
    }
}
