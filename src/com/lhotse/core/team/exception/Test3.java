package com.lhotse.core.team.exception;

public class Test3 {
    public static void main(String... arg){
        main(1);
        char x = main('v');
        System.out.println(x);

    }

    public static void main(int i){
        System.out.println("Hello world");
        return ;
    }

    public static char main(char c){
        System.out.println("this time");
        return 't';
    }
}
