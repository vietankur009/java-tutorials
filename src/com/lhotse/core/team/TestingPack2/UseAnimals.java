package com.lhotse.core.team.TestingPack2;

public class UseAnimals {
    public void doStuff(Animal a) {
        System.out.println("In the Animal version");
    }

    public void doStuff(Horse h) {
        System.out.println("In the Horse version");
    }

    public static void main(String[] args) {
        UseAnimals ua = new UseAnimals();
        //Animal animalObj = new Animal();
        //Horse horseObj = new Horse();
        Animal an = new Horse();
        ua.doStuff(an);
        //ua.doStuff(horseObj);
    }
}
