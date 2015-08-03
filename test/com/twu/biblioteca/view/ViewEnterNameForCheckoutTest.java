package com.twu.biblioteca.view;

import com.twu.biblioteca.model.RentableType;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewEnterNameForCheckoutTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldAskForABookName() {
        IView view = new ViewEnterNameForCheckout(RentableType.BOOK);

        view.show();
        assertEquals("Enter A BOOK Name\n", outContent.toString());
    }

    @Test
    public void shouldAskForAMovieName() {
        IView view = new ViewEnterNameForCheckout(RentableType.MOVIE);

        view.show();
        assertEquals("Enter A MOVIE Name\n", outContent.toString());
    }
}
