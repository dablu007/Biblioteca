package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewReturnBookTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowMessageWhenReturnBookIsSuccessful() {
        IView view = new ViewReturnBook();

        view.show();
        assertEquals("Thank you for returning the book.\n", outContent.toString());
    }
}
