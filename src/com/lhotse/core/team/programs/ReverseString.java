package com.lhotse.core.team.programs;

        import com.sun.deploy.util.StringUtils;

public class ReverseString {
    public static void reverse(String x) {
        String ar[] = x.split("");
        for (int i = ar.length - 1; i > 0; i--) {
            System.out.print(ar[i]);
        }
    }

    public static void main(String[] arg) {
        reverse("how are you");
    }
}
