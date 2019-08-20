package com.lhotse.core.team.TestingPack3;

public class Propagate {

    static String revS = "";
    static String reverse(String input){
        for(int i = input.length()-1;i>=0;i--){
            revS = revS + input.charAt(i);
        }
        return revS;
    }

    public static void main(String[] arg){
        String x = reverse("how are you");
        System.out.print(x);

        /*Propagate p1 = new Propagate();
        Propagate p2 = new Propagate();

        if(p1 instanceof Object){
            System.out.println("yes");
        }*/

        /*String y = "big surprise";
        System.out.println( y.toString() );*/
    }
}
