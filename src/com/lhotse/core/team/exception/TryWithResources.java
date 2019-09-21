package com.lhotse.core.team.exception;

public class TryWithResources {
    public static void main(String... arg) {
        try (One one = new One(); Two two = new Two()) {
            System.out.println("Try");
            throw new RuntimeException();
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}
