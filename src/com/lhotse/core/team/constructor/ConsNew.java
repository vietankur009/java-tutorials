package com.lhotse.core.team.constructor;

public class ConsNew extends Constructor {

    /*public ConsNew(){
        System.out.println("Cons New");

    }*/

    public ConsNew(int e){
        System.out.println("argu");
        Constructor c = new Constructor(2);
        System.out.println(c.getI());
    }

    public static void main(String... arg){
        //System.out.println(c.getI());
        //new ConsNew();
        new ConsNew(7);
    }
}
