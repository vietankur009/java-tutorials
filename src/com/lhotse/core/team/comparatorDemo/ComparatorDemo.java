package com.lhotse.core.team.comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

    public static void main(String... arg) {
        List<Peoplerator> li = new ArrayList<>();

        li.add(new Peoplerator("shivam", "chauhan", 479894775, 21));
        li.add(new Peoplerator("ljdig", "chotu", 833894775, 72));
        li.add(new Peoplerator("tegsg", "bada", 979894775, 49));
        li.add(new Peoplerator("yoohh", "syeraa", 679894775, 83));
        li.add(new Peoplerator("joegg", "venkatesgg", 489894775, 53));

        //System.out.println(li);
        //Collections.sort(li, new SortByFname());
        //Collections.sort(li, new SortByLname());
        //Collections.sort(li, new SortByPhone());
        //Collections.sort(li, new SortByAge());

        Collections.sort(li, (p7,p8) -> new Integer(p7.getAge()).compareTo(new Integer(p8.getAge())));
        //System.out.println(li);
        /*for(Peoplerator p : li) {
            System.out.println(p);
        }*/
        li.forEach(System.out::println);
    }
}
