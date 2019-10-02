package com.lhotse.core.team.TestingPack1;

public class Child extends  Parent{

    final int x = 0 ;               // mandatory to assign

    Child add(){
        System.out.println("child");
        return new Child();
    }

    public final static void main(String... arg){
        final int y;         // not mandatory to assign
        Child c = new Child();
        c.add();
        y =10;
        System.out.println(y);
    }
}
