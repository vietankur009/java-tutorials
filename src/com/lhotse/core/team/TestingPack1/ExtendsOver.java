package com.lhotse.core.team.TestingPack1;

public class ExtendsOver extends Over{

    public static void s(){
        System.out.println("static child");
    }

    public ExtendsOver n(){
        System.out.println("Extends Over");
        return this;
    }
    public static void main(String... arg){
        Over o = new ExtendsOver();
        o.s();
        s();
    }
}
