package com.lhotse.core.team.TestingPack3;

import java.util.Arrays;

public class A implements InterfaceDemo{
    /*static{                                          // It is working
        System.out.println("nothing");
    }*/

    public int mul(){
        return 2;
    }

    public int divide(){
        return 3;
    }
    public final static void main(String[] args) {
        byte a = 3;
        byte b = 5;
        //byte c = a+b;                // byte , char and short type is automatically converted to int while numerical operations.
        byte c = 6+7;
        //System.out.println("Hii this works");
        //System.out.println(c);

        Float[] s = new Float[6];        //      If you the wrapper class you will get null as a default value and if you use primitives you will get their
        System.out.println(Arrays.toString(s));                         // default value

        Float[] t = new Float[45];
            //System.out.println(Arrays.equals(s,t));              // checking equality of arrays

        s = t;
        System.out.println(Arrays.toString(t));
    }
}


