package com.lhotse.core.team.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] arg) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(10);
        al.add(12);
        al.remove(1);
        System.out.println(al);

        List<Integer> al1 = new LinkedList<>();
        al1.add(21);
        al1.add(49);
        System.out.println(al1);
    }
}