package com.lhotse.core.team.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {

    public static void main(String... arg){
        List<Integer> li = new ArrayList<>();
        li.add(7);
        li.add(23);
        li.add(97);
        li.add(27);
        li.add(5);
        li.add(4);
        li.add(34);
        li.add(89);
        li.add(2,56);
        //System.out.println(li);
        boolean x = li.contains(47);
        //System.out.println(x);
        int s = li.indexOf(76);
        //System.out.println(s);
        int y = li.get(4);
        //System.out.println(y);
        int v = li.remove(3);
        //System.out.println(v);
        int c = li.set(2,54);
        //System.out.println(c);
        int si = li.size();
        //System.out.println(si);
        int t = li.hashCode();
        System.out.println(t);
    }
}
