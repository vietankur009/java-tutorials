package com.lhotse.core.team.TestingPack2;

public class IntAdd {

    int add(){
        return 10;
    }

    public static void main(String []arg){
        //System.out.println(add());          When add method is static .
        IntAdd a = new IntAdd();
        int y = a.add();
        System.out.println(y);
        System.out.println("Calling Directly " + a.add());
    }
}
