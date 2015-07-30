package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewEnterBookNoTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldAskForABookNumber() {
        IView view = new ViewEnterBookNo();

        view.show();
        assertEquals("Enter A Book Number For Checkout", outContent.toString());
    }
}
