package com.lhotse.core.team.lambda;

public class ReverseString {

    public static void main(String... arg) {
        long start = System.currentTimeMillis();
        StringOnePara r = a -> {
            String rev = "";
            for(int i =a.length()-1;i>=0;i--){
                rev = rev+ a.charAt(i);
            }
            return rev;
        };
        System.out.println(r.ran("shivam"));
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }
}
