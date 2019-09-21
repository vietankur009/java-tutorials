package com.lhotse.core.team.exception;

public class Two implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Close - Two");
    }
}
