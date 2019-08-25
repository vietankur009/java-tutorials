package com.lhotse.core.team.TestingPack3;

class Feline {
    public static void main(String[] args) {
        Long x = 42L;
        Long y = 44L;
        boolean b1= true;
        Boolean b2 = false;
        String s = " ";
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(foo() + x + 5 + " ");
        System.out.println(x + y + foo());
        if((b2 = false) | (21%5) > 2) s += "x";
        if(b1 || (b2 == true) ){
            System.out.println("how are you");
        }

    }
    {in =1;}
    int in;
    static String foo() { return "foo"; }

}
