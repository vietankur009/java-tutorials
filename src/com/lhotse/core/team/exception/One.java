package com.lhotse.core.team.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class One implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Close - One");
    }

    public void eat() throws ReflectiveOperationException{
        System.out.println("eat1");
    }
}
