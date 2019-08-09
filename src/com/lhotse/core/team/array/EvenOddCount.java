package com.lhotse.core.team.array;

public class EvenOddCount {
    public static int method(int input1,int input2,int input3,int input4,int input5,String input6){
        int ar[] = {input1,input2,input3,input4,input5};
        int even = 0;
        int odd = 0;
        for(int i = 0;i<5;i++){
            if(ar[i]%2==0){
                even++;
            }else if(ar[i]%2 !=0){
                odd++;
            }
        }
        if(input6 =="even"){
            return even;
        }else{
            return odd;
        }
    }

    public static void main(String[] args){
        int z = method(3,45,5,72,7,"even");
        System.out.println(z);
    }
}
