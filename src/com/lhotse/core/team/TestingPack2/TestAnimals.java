package com.lhotse.core.team.TestingPack2;

public class TestAnimals {
    public static void main (String [] args) {
        Animal a = new Horse();
        Animal b = new Animal();
        a.eat();
        b.eat();

        //a.buck(); //It will not run as this method is defined in Horse class and we are taking reference of Animal.
    }
}
