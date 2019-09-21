package com.lhotse.core.team.comparatorDemo;

import java.util.Comparator;

public class SortByPhone implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Peoplerator p5 = (Peoplerator) o1;
        Peoplerator p6 = (Peoplerator) o2;
        return new Integer(p5.getPhone()).compareTo(new Integer(p6.getPhone()));
    }
}
