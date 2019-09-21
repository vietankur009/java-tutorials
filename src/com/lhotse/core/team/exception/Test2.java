package com.lhotse.core.team.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 extends  One{

    //@Override
    public void eat() throws ClassNotFoundException{
        System.out.println("eat 2");
    }

    public static void main(String... arg) {
        One on = new Test2();
        try {
            on.eat();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
