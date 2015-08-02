package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewShowOptionsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowTheMenuOptions() {
        IView view = new ViewShowOptions();

        view.show();
        String expected = "1.List Books\n" + "2.Checkout a Book\n" + "3.Return a Book\n" + "4.List Movies\n"
                + "5.Quit\n";
        assertEquals(expected, outContent.toString());
    }
}
