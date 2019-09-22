package com.lhotse.core.team.comparatorDemo;

import java.util.Comparator;

public class SortByAge implements Comparator<Peoplerator> {

    @Override
    public int compare(Peoplerator p7, Peoplerator p8) {
        //Peoplerator p7 = (Peoplerator) o1;
        //Peoplerator p8 = (Peoplerator) o2;
        return new Integer(p7.getAge()).compareTo(new Integer(p8.getAge()));
    }
}
