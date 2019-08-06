package com.lhotse.core.team.TestingPack3;

public class Dog {
    Collar c; // instance variable
    String name;

    void go(Dog dog) { // local variable: dog
        c = new Collar();
        dog.setName("Aiko");
    }

    void setName(String dogName) { // local var: dogName
        name = dogName;
        // do more stuff
    }

    public static void main(String[] arg) {
        Dog d; // local variable: d
        d = new Dog();
        d.go(d);
    }
}
