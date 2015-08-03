package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewReturnTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowMessageWhenReturnBookIsSuccessful() {
        IView view = new ViewReturn();

        view.show();
        assertEquals("Thank you for returning the book.\n", outContent.toString());
    }
}
