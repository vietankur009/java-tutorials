package com.lhotse.core.team.comparatorDemo;

import com.lhotse.core.team.comparableDemo.People;

import java.util.Comparator;

public class SortByFname implements Comparator<Peoplerator> {


    @Override
    public int compare(Peoplerator p1, Peoplerator p2) {
        /*Peoplerator p1 = (Peoplerator) o1;
        Peoplerator p2 = (Peoplerator) o2;*/
        return p1.getFname().compareTo(p2.getFname());
    }
}
