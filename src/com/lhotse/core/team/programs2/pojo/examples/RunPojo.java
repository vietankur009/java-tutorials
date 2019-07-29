package com.lhotse.core.team.programs2.pojo.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RunPojo {
    public static void main(String... arg) {

        MensPojo ankur = new MensPojo();
        ankur.setName("Ankur Chauhan");
        ankur.setAge(33);
        ankur.setMobileNo("+91-8285588470");
        //System.out.println(ankur);

        MensPojo ankit = new MensPojo();
        ankit.setName("Ankit Chauhan");
        ankit.setAge(31);
        ankit.setMobileNo("+91-8285588471");
//        System.out.println(ankit);

        MensPojo shivam = new MensPojo();
        shivam.setName("Shivam Chauhan");
        shivam.setAge(21);
        shivam.setMobileNo("+91-8285588472");
//        System.out.println(shivam);

        MensPojo jonny = new MensPojo();
        jonny.setName("Gaurav Chauhan");
        jonny.setAge(28);
        jonny.setMobileNo("+91-8285588473");
//        System.out.println(jonny);


        List<MensPojo> mensList = new ArrayList<>();
        mensList.add(ankur);
        mensList.add(ankit);
        mensList.add(shivam);
        mensList.add(jonny);

//        System.out.println(mensList);


        Iterator<MensPojo> mensItr = mensList.iterator();
        while (mensItr.hasNext()) {
            MensPojo man = mensItr.next();
            System.out.println("Mr. " + man.getName()+", AGe is :"+(man.getAge()+5));
        }
    }
}
