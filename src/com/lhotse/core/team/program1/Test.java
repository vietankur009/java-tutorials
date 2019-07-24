package com.lhotse.core.team.program1;

public class Test {
    public static void main(String[] args){
        table();
    }
    public static void table (){
        for(int i = 1;i <=10;i++){
            for(int j = 1; j<=10;j++ ) {
                System.out.print(i +" * "+ j + " = " + i*j + "\t");
            }
            System.out.println(" ");
        }
    }
}
