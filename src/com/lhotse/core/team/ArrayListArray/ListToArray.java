package com.lhotse.core.team.ArrayListArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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


        String [] st = new String[6];
        st = al.toArray(st);
        /*for(String a : st){
            System.out.println(a);
        }*/

        Object[] as = al.toArray();
        System.out.println(as);

        /*String [] s = new String[6];
        s = al.toArray(s);*/
        /*Arrays.sort(s);
        System.out.println(Arrays.toString(s));*/
        /*for(String a : s){
            System.out.println(a);
        }*/
    }
}
