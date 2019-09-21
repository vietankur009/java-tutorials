package com.lhotse.core.team.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo1 {

    public static void main(String... arg) {
        List<People> li = new ArrayList<>();

        li.add(new People("shivam", "chauhan", 479894775, 21));
        li.add(new People("ljdig", "chotu", 833894775, 72));
        li.add(new People("tegsg", "bada", 979894775, 49));
        li.add(new People("yoohh", "syeraa", 679894775, 83));
        li.add(new People("joegg", "venkatesgg", 489894775, 53));

        //System.out.println(li);
        Collections.sort(li);
        for(People p : li) {
            System.out.println(p);
        }
    }
}
