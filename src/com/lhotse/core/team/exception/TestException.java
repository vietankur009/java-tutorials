package com.lhotse.core.team.exception;

public class TestException {

    static String reverse(String s){
        String rev = "";
        try{
            if(s.length()==0) {
                for (int i = s.length() - 1; i < 0; --i) {
                    rev += s.charAt(i);
                }
            }

        }catch(NullPointerException e){
            e.printStackTrace();
        }
        return rev;
    }

    public static void main(String... arg) {
        String s = reverse("");
        System.out.println(s);
    }
}
