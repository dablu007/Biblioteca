package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewNotCheckoutTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldShowBookNotAvailableWhenNotInLibrary() {
        IView view = new ViewNotCheckout();

        view.show();
        assertEquals("That book is not available\n", outContent.toString());
    }
}
