package com.lhotse.core.team.collection;

import java.util.*;

public class Map1 {

    public static void main(String... arg){
        Map<Integer,Integer> mp = new TreeMap<>();
        mp.put(1,7);
        mp.put(2,5);
        mp.put(3,6);
        mp.put(4,93);
        mp.put(5,75);
        mp.put(6,2);
        int x = mp.get(3);
        //System.out.println(x);
        //boolean y = mp.containsKey(4);
        boolean y = mp.containsValue(73);
        //System.out.println(y);
        Set s = mp.keySet();
        //System.out.println(s);
        int z = mp.size();
        //System.out.println(z);
        int d = mp.remove(5);
        //System.out.println(d);
        boolean b = mp.remove(3,6);
        //System.out.println(b);
        //int g = mp.replace(4,90);
        boolean g = mp.replace(4,93,90);
        //System.out.println(g);
        Collection<Integer> c = mp.values();
        //System.out.println(c);
        Set b1 = mp.entrySet();
        //System.out.println(b1);
        Set<Map.Entry<Integer,Integer>> e = mp.entrySet();
        e.forEach(p-> System.out.println(p));
    }
}
