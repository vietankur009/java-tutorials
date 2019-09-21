package com.lhotse.core.team.comparatorDemo;

import java.util.Comparator;

public class SortByAge implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Peoplerator p7 = (Peoplerator) o1;
        Peoplerator p8 = (Peoplerator) o2;
        return new Integer(p7.getAge()).compareTo(new Integer(p8.getAge()));
    }
}
