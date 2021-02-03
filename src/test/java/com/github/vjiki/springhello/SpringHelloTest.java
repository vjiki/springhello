package com.github.vjiki.springhello;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SpringHelloTest {

    @Test
    public void test() {

        final ByteArrayOutputStream sink = new ByteArrayOutputStream();
        PrintStream controlledOut = new PrintStream(sink);
        PrintStream defaultOut = System.out;

        System.setOut(controlledOut);

        SpringHello.main(new String[]{});

        controlledOut.flush();
        assertEquals("Hello, Autocode!", sink.toString().trim());

        System.setOut(defaultOut);
    }
}