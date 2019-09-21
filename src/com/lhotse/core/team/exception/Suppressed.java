package com.lhotse.core.team.exception;

public class Suppressed {
    public static void main(String... arg){
        try(One2 one2 = new One2()){
            throw new Exception("Try");
        }catch(Exception e){
            System.out.println(e.getMessage());
            for (Throwable t : e.getSuppressed()){
                System.out.println("supp: " + t);
            }
        }
    }
}
