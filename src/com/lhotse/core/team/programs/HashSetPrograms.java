package com.lhotse.core.team.programs;

import java.util.HashSet;

/**
 * Created by Lhotse Team on 7/24/2019.
 */
public class HashSetPrograms {
    public static void main(String... arg){
        HashSet <String> list = new HashSet<>();
        list.add("Ankit");
        list.add("Ankur");
        list.add("Ankur");
        list.add("Ankur");
        list.add("Ankur");
        list.add("Navneet");
        list.add("Priyanka");
        list.add("hanshu");

        for(String element : list){
            System.out.println(element);
        }
    }

}
