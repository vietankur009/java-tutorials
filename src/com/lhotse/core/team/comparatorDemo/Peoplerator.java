package com.lhotse.core.team.comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Peoplerator {

    public Peoplerator() {/*default constructor*/}

    public Peoplerator(String fname, String lname, int phone, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.phone = phone;
    }

    int phone;
    String fname;
    String lname;
    int age;

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        return "{" + "fname=" + fname + ", lname='" + lname + '\'' + ", phone='" + phone + '\'' + ", age=" + age + '}';
    }

    /*public static void main(String... arg) {
        List<Peoplerator> li = new ArrayList<>();

        li.add(new Peoplerator("shivam", "chauhan", 479894775, 21));
        li.add(new Peoplerator("ljdig", "chotu", 833894775, 72));
        li.add(new Peoplerator("tegsg", "bada", 979894775, 49));
        li.add(new Peoplerator("yoohh", "syeraa", 679894775, 83));
        li.add(new Peoplerator("joegg", "venkatesgg", 489894775, 53));

        System.out.println(li);
        //Collections.sort(li, new SortByFname());
        //Collections.sort(li, new SortByLname());
        //Collections.sort(li, new SortByPhone());
        Collections.sort(li, new SortByAge());
        for(Peoplerator p : li) {
            System.out.println(p);
        }
    }*/
}