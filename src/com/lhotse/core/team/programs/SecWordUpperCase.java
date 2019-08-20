package com.lhotse.core.team.programs;

public class SecWordUpperCase {
    static String upperCase ;
    static String secUpperCase(String input1){
        String y[] = input1.split(" ");
        if(y.length <=1){
            upperCase = "Less";
        }else{
            upperCase = y[1].toUpperCase().trim();
        }
        return upperCase;
    }

    public static void main(String[] arg){
        String v = secUpperCase("how 2017 ");
        System.out.println(v);
    }
}
