package com.lhotse.core.team.TestingPack1;

// In this we are making an object of class Test3 and checking for different reference variable that which method can be called.
// In every case object is of Test3 and in 1 we have reference of class Test1 so only Test1 method will be called .
// In 2 ,ref is of Test2 so Test1 and Test2 method will be called.
// In 3 ,ref is of Test3 so Test1, Test2 and Test3 method will be called.
// because Test2 extends Test1 and Test3 extends Test2.

public class Test3 extends Test2 {
    public void test3go() {
        System.out.println("test3go");
    }

    public static void main(String... arg) {
    // 1
        Test1 t1 = new Test3();
        t1.go1();
    // 2
        Test2 t2 = new Test3();
        t2.go1();
        t2.test2go();
    // 3
        Test3 t3 = new Test3();
        t3.go1();
        t3.test2go();
        t3.test3go();
    }

    Test1 x = new Test1();
    Test2 y = (Test2) x;
}