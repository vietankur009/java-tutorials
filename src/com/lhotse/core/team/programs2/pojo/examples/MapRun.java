package com.lhotse.core.team.programs2.pojo.examples;

import java.util.*;

public class MapRun {

    public static void main(String... arg) {
        Map<String, String> ankur = new HashMap<>();
        ankur.put("name", "Ankur");
        ankur.put("age", "33");
        ankur.put("mobileNo", "+91-8285588470");
        System.out.println(ankur);


        Set<String> keys = ankur.keySet();

        Map<String, String> ankit = new HashMap<>();
        ankit.put("name", "ankit");
        ankit.put("age", "32");
        ankit.put("mobileNo", "+91-8285588471");
        System.out.println(ankit);

        List<Map<String, String>> list = new ArrayList<>();
        list.add(ankur);
        list.add(ankit);

        for(Map<String,String> men: list){
            System.out.println("Mr. "+men.get("name")+", Age is : "+men.get("age"));
        }

        Iterator<Map<String, String>> itr = list.iterator();
        while (itr.hasNext()){
            Map<String, String> men = itr.next();
            System.out.println("Mr. "+men.get("name")+", Age is : "+men.get("age"));
        }
    }
}
