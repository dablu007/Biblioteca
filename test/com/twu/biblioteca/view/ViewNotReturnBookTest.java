package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewNotReturnBookTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowMessageWhenBookReturningIsNotValid() {
        IView view = new ViewNotReturnBook();

        view.show();
        assertEquals("That is not a valid book to return\n", outContent.toString());
    }
}
