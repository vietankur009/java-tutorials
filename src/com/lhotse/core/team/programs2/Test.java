package com.lhotse.core.team.programs2;

public class Test implements InterfacePrograms {

    public void add(){
        int first = 1;
        for (int count = 1; count <= 10; count = count + 1){
            first = count * first;
        }
        System.out.println(first);

        System.out.println("Ankit Chauhan");
    }

    public void multiply (){
        for(int a = 1; a<=10; a=a+1){
            System.out.println("TABLE FOR:" + a) ;

            for (int b = 1; b<=10; b=b+1){
                System.out.println(a + " * " + b + " = " + a * +b);
            }
            System.out.println("----------------------------------------------------");
        }
        System.out.println("Ankit Chauhan");
    }
}
