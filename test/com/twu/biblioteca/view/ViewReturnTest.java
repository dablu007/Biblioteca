package com.twu.biblioteca.view;

import com.twu.biblioteca.model.RentableType;
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
        IView view = new ViewReturn(RentableType.BOOK);

        view.show();
        assertEquals("Thank you for returning the BOOK.\n", outContent.toString());
    }

    @Test
    public void shouldShowMessageWhenReturnMovieIsSuccessful() {
        IView view = new ViewReturn(RentableType.MOVIE);

        view.show();
        assertEquals("Thank you for returning the MOVIE.\n", outContent.toString());
    }
}
