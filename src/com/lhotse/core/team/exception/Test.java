package com.lhotse.core.team.exception;

import java.util.Arrays;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {


        public static void main(String... arg) {
       /* String input = "1 2 a 3 45 6";
        Scanner sc = new Scanner(input);
        int x = 0;
        do {
            x = sc.nextInt();
            System.out.print(x + " ");
            } while (x != 0);
        }*/


            //String s = "Shivam Chauhan";
            //String s1 = s;
            //System.out.println(s +" " + (s1==s1));
            //s = s.substring(4,7);
            //System.out.println(s);

            //char [] a = s.toCharArray(); //doubt
            //System.out.println(a);

            int[] i = {3, 3, 44, 4, 3, 43};  //doubt
            System.out.println(Arrays.toString(i));
            //StringBuilder sb = new StringBuilder(s);
            //StringBuilder sb1 = sb;
            //sb.append("Rajput");
            //System.out.println(sb+ ""+ sb1+ (sb==sb1));
            //sb.deleteCharAt(6);
            //sb.replace(4,6,"kumar");
            //System.out.println(sb);
        }
    }

    /*public static void main(String[] args) {
        System.gc();
        long start=new GregorianCalendar().getTimeInMillis();
        long startMemory=Runtime.getRuntime().freeMemory();
        StringBuffer sb = new StringBuffer();
        //StringBuilder sb = new StringBuilder();
        for(int i = 0; i<100000; i++){
            sb.append(":").append(i);
        }
        long end=new GregorianCalendar().getTimeInMillis();
        long endMemory=Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:"+(end-start));
        System.out.println("Memory used:"+(startMemory-endMemory));
    }*/


        /*public static void main(String[] args){
            long startTime = System.currentTimeMillis();
            StringBuffer sb = new StringBuffer("Java");
            for (int i=0; i<10000; i++){
                sb.append("Tpoint");
            }
            System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
            startTime = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder("Java");
            for (int i=0; i<10000; i++){
                sb2.append("Tpoint");
            }
            System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
        }*/


