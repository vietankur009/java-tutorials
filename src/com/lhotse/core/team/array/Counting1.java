package com.lhotse.core.team.array;

public class Counting1 {
    public static void main(String[] arg){
        int[] r = {1,2,3,1,2,1,2,2};
        int count = 0;
        int e = 1;
        for(int i =0;i<r.length;i++){
            if(r[i]==e){
                count = count+1;
            }
        }
        System.out.print(e + " "+count);
    }
}




