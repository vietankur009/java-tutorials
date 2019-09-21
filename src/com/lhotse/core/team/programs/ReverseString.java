package com.lhotse.core.team.programs;

        import com.sun.deploy.util.StringUtils;

public class ReverseString {
    public static void reverse(String ar) {
        long start = System.currentTimeMillis();
        String rev = "";
        for (int i = ar.length() - 1; i >=0; i--) {
            rev = rev + ar.charAt(i);
        }
        System.out.println(rev);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }

    public static void main(String[] arg) {
        //long start = System.currentTimeMillis();
        reverse("shivam");
        //long end = System.currentTimeMillis();
        //System.out.println((end - start) + "ms");
    }
}
