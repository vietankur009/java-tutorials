package com.lhotse.core.team.exception;

public class Test4 {

    public static void main(String... arg) {
        try {
            String x = null;
            x.length();
        } catch (NullPointerException e) {
            //e = new NullPointerException();
            System.out.println(e);

        }
    }
}
