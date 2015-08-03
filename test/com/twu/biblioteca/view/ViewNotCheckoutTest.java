package com.twu.biblioteca.view;

import com.twu.biblioteca.model.RentableType;
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
        IView view = new ViewNotCheckout(RentableType.BOOK);

        view.show();
        assertEquals("That BOOK is not available\n", outContent.toString());
    }
}
