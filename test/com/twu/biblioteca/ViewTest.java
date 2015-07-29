package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

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


    @Test
    public void shouldDisplayBook() {
        View view = new View();
        HashMap book = new HashMap();

        String expectedOutput = String.format("%s%20s%27s%17s", book.get("bookNo"),
                                    book.get("bookName"), book.get("author"),
                book.get("publication"));
        expectedOutput = expectedOutput + "\n----------------------------------------------------------------------\n";
        view.showBook(book);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void shouldDisplayMenuOptions() {
        View view = new View();

        view.showOptions();
        String expectedOutput = "1.List Books\n" + "2.Checkout a Book\n" + "3.Quit\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void shouldDisplayCheckoutMessage() {
        View view = new View();

        view.showCheckOutMessage();
        assertEquals("Books Successfully Checkout\n", outContent.toString());
    }
}
