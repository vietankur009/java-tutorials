package com.lhotse.core.team.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReverseStringElement {

    public static void main(String... arg) {
        List<String> al = new ArrayList<>();
        al.add("Ankur");
        al.add("Ankit");
        al.add("Shivam");
        Stream<StringBuilder> s= al.stream().map(p -> new StringBuilder(p).reverse());
        s.forEach(System.out::println);
        //System.out.println(al);
    }
}
