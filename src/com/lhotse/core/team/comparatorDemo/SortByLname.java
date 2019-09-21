package com.lhotse.core.team.comparatorDemo;

import java.util.Comparator;

public class SortByLname implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Peoplerator p3 = (Peoplerator) o1;
        Peoplerator p4 = (Peoplerator) o2;
        return p3.getLname().compareTo(p4.getLname());
    }
}
