package com.lhotse.core.team.programs;

import java.util.*;

public class PalindromePossible {
    int count;
    private static int fillMapWithKeys(String input){
        String[] ar = input.split("");
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < ar.length; i++){
            Integer keyValue = mp.put(ar[i], 1);
            //System.out.println(keyValue);
            if (keyValue != null){
                Integer newV = keyValue + 1;
                mp.put(ar[i], newV);
            }
        }

        if(mp.size()==1){
            checkSizeForOneKey(mp.keySet());
        }else if((input.length()) /2 ==0 ){
            if((input.length()==2)) {
                processEvenLengthNumber(mp.keySet(), input);
            }else if(input.length()==4){

            }
        }
        //else if(){

        //}
        return 2;
    }

    public static int checkSizeForOneKey(Set<String> x){
        if(x.size()==1){
            System.out.println("Number is Palindrome");
        }
        return 2;
    }

    public static int processEvenLengthNumber(Set<String> y,String z){
        if(y.size()==z.length()/2){
            System.out.println("Number is Palindrome");
        }
        return 2;
    }

    /*public static int (){

    }*/

    public static void main(String[] arg){
        int x = fillMapWithKeys("23000");
        System.out.println(x);
    }
}
