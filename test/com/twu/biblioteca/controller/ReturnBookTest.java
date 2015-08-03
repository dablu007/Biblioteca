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

public class ReturnBookTest {
    private ByteArrayInputStream inputStream = new ByteArrayInputStream("Java".getBytes());
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
        IOperation returnBook = new ReturnBook(library);

        returnBook.execute();
        assertEquals("Enter A BOOK Name\n", outputStream.toString());
        verify(library).returnItem("Java", RentableType.BOOK);
    }

}
