package com.twu.biblioteca.view;

import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewShowOptions;
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
        String expected = "1.List Books\n" + "2.Checkout a Book\n" + "3.Quit\n";
        assertEquals(expected, outContent.toString());
    }
}