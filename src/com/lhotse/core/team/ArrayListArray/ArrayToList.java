package com.lhotse.core.team.ArrayListArray;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String... arg){
        String[] as = {"one", "two", "three", "four", "five", "six"};
        List al = Arrays.asList(as);
        for(String s : as){
            System.out.println(s);
        }
        System.out.println(al);
    }
}
