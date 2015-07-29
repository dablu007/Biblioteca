package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


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

    @Test
    public void shouldDisplayBook() {
        View view = new View();
        HashMap book = new HashMap();

        String expectedOutput = String.format("%s%20s%27s%17s", book.get("bookNo"),
                                    book.get("bookName"), book.get("author"),
                book.get("publication"));
        view.showBook(book);
        assertEquals(expectedOutput+"\n",outContent.toString());
    }

}
