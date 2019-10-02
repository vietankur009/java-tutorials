package com.lhotse.core.team.programs;

public class Armstrong {

    public static void arm(int input) {
        int n = input;
        int num = 0;
        while (input != 0) {
            int r = input % 10;
            r = r * r * r;
            num = num + r;
            input = input / 10;
        }
        if (n == num) {
            System.out.println(num + " armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

    public static void main(String... arg) {
        arm(153);
    }
}
