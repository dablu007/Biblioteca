package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.RentableType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ReturnMovieTest {

    private ByteArrayInputStream inputStream = new ByteArrayInputStream("Harry Potter 1".getBytes());
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setIn(inputStream);
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void setAfter() {
        System.setIn(System.in);
    }

    @Test
    public void shouldReturnAValidCheckoutBook() {
        Library library = mock(Library.class);
        IOperation returnMovie = new ReturnMovie(library);

        returnMovie.execute();
        assertEquals("Enter A MOVIE Name\n", outputStream.toString());
        verify(library).returnItem("Harry Potter 1", RentableType.MOVIE);
    }
}
