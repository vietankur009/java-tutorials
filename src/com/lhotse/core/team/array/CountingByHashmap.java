package com.lhotse.core.team.array;

import java.util.HashMap;
import java.util.Map;

public class CountingByHashmap {
    public static void main(String[] arg){
        int[] r = {1,2,3,1,2,1,2,2};
        Map<Integer ,Integer> mp = new HashMap<>();
        for (int i =0;i<r.length;i++){
            Integer existingValue = mp.put(r[i], 1);
            //System.out.println(existingValue);
            if (existingValue != null) {
                int newValue = existingValue + 1;
                mp.put(r[i], newValue);
            }
        }
        System.out.print(mp);
    }
}
