package com.lhotse.core.team.TestingPack2;

abstract public class Vehicle {
    private static String type;
    public abstract void goUpHill(); // Abstract method
    public static String getType() { // Non-abstract method
        System.out.println("hii this is vehicle");
        return type;

    }

}

