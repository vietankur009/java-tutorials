package com.lhotse.core.team.TestingPack1;

public class Test2 extends Test1{
    //final int x;
    public void test2go(){
        System.out.println("tes2go");
    }

   public static void main(String... arg){
       Test1 [] t = {new Test1(), new Test2()};
       for(Test1 t1 : t){
           t1.go1();
           if(t1 instanceof Test2){
                Test2 t2 = (Test2) t1;      //down casting
                t2.test2go();
           }
       }
   }
}
