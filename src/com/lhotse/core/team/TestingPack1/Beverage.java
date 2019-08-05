package com.lhotse.core.team.TestingPack1;

public class Beverage {
    static void goFast(int x){
        System.out.println("go fast");

    }

    void inF(){
        goFast(1);
    }
    public static void main(String[] arg){
        Beverage be = new Beverage();
        be.goFast(1);
        goFast(3);
        be.inF();
    }

}
