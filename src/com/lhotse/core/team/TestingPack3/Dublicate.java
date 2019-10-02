package com.lhotse.core.team.TestingPack3;

public class Dublicate {

    public static void dub(String a){
        char [] s = a.toCharArray();
        for(int i = 0;i<s.length;i++){
            for(int j =i+ 1;j<s.length;j++) {
                if (s[i] == (s[j])) {
                    System.out.println(s[j]);
                    break;
                }
            }
        }
    }

    public static void removeSpace(String b){
        String x = b.replaceAll(" ","");
        System.out.println(x);
    }

    public static void main(String... arg){
        dub("w3schools");
        removeSpace("      Geeks     for    Geeks        ");
    }
}
