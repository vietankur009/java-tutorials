package com.lhotse.core.team.ArrayListArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListToArray {

    public static void main(String... arg){
        List<String> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        al.add("five");
        al.add("six");
        /*Object [] o = al.toArray();
        for(Object s: o){
            System.out.println(s);
        }*/
        String [] s = new String[6];
        s = al.toArray(s);
        for(String a : s){
            System.out.println(a);
        }
    }
}
