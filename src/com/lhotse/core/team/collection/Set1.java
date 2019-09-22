package com.lhotse.core.team.collection;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

    public static void main(String... arg){
        Set<Integer> s = new HashSet<>();
        s.add(7);
        s.add(23);
        s.add(97);
        s.add(27);
        s.add(5);
        s.add(4);
        s.add(34);
        s.add(89);
        //s.add(2,89);
        System.out.println(s);
    }
}
