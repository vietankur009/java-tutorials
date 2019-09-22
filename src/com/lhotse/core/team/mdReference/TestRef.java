package com.lhotse.core.team.mdReference;

import java.util.ArrayList;
import java.util.List;

public class TestRef {

    public static void test(Integer s) {     // static method
        System.out.println(s);
    }

    public void obTest(Integer i) {     // non-static method
        System.out.println(i + "shivam");
    }

    public static void main(String... arg) {
        List<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(94);
        al.add(84);
        al.add(65);
        // al.forEach(p -> System.out.println(p));   In this lambda expression list element to print.
//      al.forEach(TestRef::test);       // here method reference is calling test method and print the element .
        al.forEach((new TestRef())::obTest);    // here method reference is calling obTest method and print the element .
    }
}
