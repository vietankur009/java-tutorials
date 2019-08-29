package com.lhotse.core.team.sprint;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RunPojoDummyData {
    public static void main(String[] arg) {

        PojoDummyData a = new PojoDummyData();
        a.setName("jojo1");
        a.setAddress("xyz1");
        a.setPhone("8888888891");
        a.setEmail("a@gmail.com");

        PojoDummyData b = new PojoDummyData();
        b.setName("jojo2");
        b.setAddress("xyz2");
        b.setPhone("8888888892");
        b.setEmail("b@gmail.com");

        PojoDummyData c = new PojoDummyData();
        c.setName("jojo3");
        c.setAddress("xyz3");
        c.setPhone("8888888893");
        c.setEmail("c@gmail.com");

        PojoDummyData d = new PojoDummyData();
        d.setName("jojo4");
        d.setAddress("xyz4");
        d.setPhone("8888888894");
        d.setEmail("d@gmail.com");

        PojoDummyData e = new PojoDummyData();
        e.setName("jojo5");
        e.setAddress("xyz5");
        e.setPhone("8888888895");
        e.setEmail("e@gmail.com");

        PojoDummyData f = new PojoDummyData();
        f.setName("jojo6");
        f.setAddress("xyz6");
        f.setPhone("8888888896");
        f.setEmail("f@gmail.com");

        PojoDummyData g = new PojoDummyData();
        g.setName("jojo7");
        g.setAddress("xyz7");
        g.setPhone("8888888897");
        g.setEmail("g@gmail.com");

        PojoDummyData h = new PojoDummyData();
        h.setName("jojo8");
        h.setAddress("xyz8");
        h.setPhone("8888888898");
        h.setEmail("h@gmail.com");

        PojoDummyData i = new PojoDummyData();
        i.setName("jojo9");
        i.setAddress("xyz9");
        i.setPhone("8888888899");
        i.setEmail("i@gmail.com");

        PojoDummyData j = new PojoDummyData();
        j.setName("jojo0");
        j.setAddress("xyz0");
        j.setPhone("8888888810");
        j.setEmail("j@gmail.com");


        List<PojoDummyData> mn = new ArrayList<>();
        mn.add(a);
        mn.add(b);
        mn.add(c);
        mn.add(d);
        mn.add(e);
        mn.add(f);
        mn.add(g);
        mn.add(h);
        mn.add(i);
        mn.add(j);

        //System.out.println(mn);
        System.out.println("Name  " +" Address" + "     Phone  " + "     Email  " + "\t");
        Iterator<PojoDummyData> Itr = mn.iterator();
        while (Itr.hasNext()) {
            PojoDummyData man = Itr.next();
            System.out.println(man.getName() +"   "+man.getAddress() + "    " + man.getPhone() + "   " + man.getEmail() + "\t");
        }
    }
}


