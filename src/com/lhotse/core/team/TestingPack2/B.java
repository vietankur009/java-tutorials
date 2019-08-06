package com.lhotse.core.team.TestingPack2;

public class B {
    A number(){
        A a = new A();
        return a;
    }

    public static void main(String[] arg){
        B b = new B();
        A z = b.number();
        System.out.println(z.add());
    }

}
