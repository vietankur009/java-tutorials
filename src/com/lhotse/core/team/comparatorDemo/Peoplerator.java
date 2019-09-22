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
}