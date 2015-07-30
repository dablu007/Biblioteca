package com.twu.biblioteca;

import com.twu.biblioteca.view.ViewWelcomeMessage;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewWelcomeMessageTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldTestTheWelcomeMessage() {
        ViewWelcomeMessage viewWelcomeMessage = new ViewWelcomeMessage();

        viewWelcomeMessage.show();
        assertEquals("Welcome to The Bangalore Public Library\n",outContent.toString());
    }
}
