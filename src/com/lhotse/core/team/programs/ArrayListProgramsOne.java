package com.lhotse.core.team.programs;

import java.util.ArrayList;

/**
 * Created by Lhotse Team on 7/24/2019.
 */
public class ArrayListProgramsOne {
    public static void main(String... arg) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ankit");
        list.add("Ankit");
        list.add("Ankur");
        list.add("Shivam");
        list.add(1, "Ram singh");
        list.add(3, "singh");
        list.remove(3);

        for (int i = 0; i < list.size(); i = i + 1) {
            System.out.print(list.get(i) + ", ");
        }


        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("second Ankit");
        secondList.add("second Ankur");
        System.out.println(" ");
        list.addAll(secondList);

        for (int i = 0; i < list.size(); i = i + 1) {
            System.out.print(list.get(i) + " *");
        }
        System.out.println(list.contains("Ankit"));
        list.clear();
        System.out.println(list + " == After clear");
    }
}
