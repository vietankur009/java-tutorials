package com.lhotse.core.team.constructor;

public class Constructor {
    int i ;
    int j ;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public Constructor(){}

    public Constructor(int i){
        this.i = 10;
        this.j = 20;
        System.out.println("cons");
    }
}
