package com.lhotse.core.team.programs;


import java.util.HashMap;
import java.util.Map;

public class PalindromePossible {
    private static int palPop(String input) {
        int count = 0;
        String [] ar = input.split("");
        Map<String,Integer> mp = new HashMap<>();
        for(int i =0;i<ar.length;i++){
            Integer keyValue = mp.put(ar[i],1);
            //System.out.println(keyValue);
            if(keyValue != null){
                Integer newV = keyValue +1;
                mp.put(ar[i],newV);
            }
        }
        System.out.println(mp.keySet());

        if(mp.size() == (ar.length/2+1))
            count = 2;
        else if (mp.size() ==1)
            count = 2;
        else
            count =1;

        if(count==2)
            return 2;
        else
            return 1;
    }

    public static void main(String[] arg) {
        int x = palPop("23000");
        System.out.println(x);
    }
}
