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
        View view = mock(View.class);
        HashMap book = new HashMap();
        book.put("bookNo",1);
        book.put("bookName",1);
        book.put("availability",1);
        book.put("author",1);
        book.put("publication",1);

        view.showBook(book);
        verify(view).showBook(book);
    }
}
