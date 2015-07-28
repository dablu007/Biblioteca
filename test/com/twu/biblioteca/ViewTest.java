package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldCheckForTheWelcomeMessage() {
        View messages = new View();

        messages.showWelcomeMessage();
        assertEquals("Welcome to The Bangalore Public Library\n",outContent.toString());
    }
}
