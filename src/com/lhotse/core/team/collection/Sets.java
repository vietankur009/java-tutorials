package com.lhotse.core.team.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String [] arg) {
        Set<String> st = new HashSet<String>();
        st.add("Shivam");
        st.add("Satyam");
        st.add("Rakshit");
        //st.add("Shivam");
        //st.clear();
        /*HashSet hs = new HashSet();
        hs = (HashSet)st.clone();
        System.out.println(hs);*/
        //System.out.println(st);
        st.contains("shivam");
        st.size();
        st.isEmpty();
        st.remove("Shivam");
        System.out.println(st);

        Set<Integer> st2 = new LinkedHashSet<>();
        st2.add(74);
        st2.add(74);
        System.out.println(st2);

        Set<Integer> st1 = new TreeSet<>();
        st1.add(60);
        st1.add(5);
        st1.add(18);
        st1.add(8);
        st1.add(1);
        st1.add(72);
        System.out.println(st1);
    }
}

