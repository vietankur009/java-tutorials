package com.lhotse.core.team.TestingPack2;

public class Horse extends Animal {
    public void eat() {
        System.out.println("Horse");
        super.eat();
    }
    public void buck() { }

    public static void main(String[] arg){
        Animal a = new Horse();
        a.eat();
    }
}
