package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ReturnBookTest {
    private ByteArrayInputStream inputStream = new ByteArrayInputStream("Java".getBytes());

    @Before
    public void setUpStreams() {
        System.setIn(inputStream);
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
        verify(library).returnItem("Java");
    }
}
