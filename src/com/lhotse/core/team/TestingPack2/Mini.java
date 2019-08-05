package com.lhotse.core.team.TestingPack2;

public class Mini extends Car {
    public void goUpHill() {
    // Mini-specific going uphill code
        System.out.println("hii this is mini");
    }

    public static void main(String [] arg){
        Mini mn = new Mini();
        mn.goUpHill();
        doCarThings();
        getType();
    }
}
