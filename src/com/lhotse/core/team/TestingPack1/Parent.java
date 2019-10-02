package com.lhotse.core.team.TestingPack1;



public class Parent{

    Parent add() {
        System.out.println("parent");
        return null;             // or we can use object as a return type i.e. new Parent()   // or we can return object of subtype. i.e new Child()
    }
}
