package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewEnterBookNameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldAskForABookNumber() {
        IView view = new ViewEnterBookName();

        view.show();
        assertEquals("Enter A Book Name\n", outContent.toString());
    }
}
