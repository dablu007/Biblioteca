package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.RentableType;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.IView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class CheckoutBookTest {
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
    public void shouldCheckOutABook() {
        Library library = mock(Library.class);
        User user = mock(User.class);
        IView view = mock(IView.class);
        IOperation checkoutBook = new CheckoutBook(library, user);

        checkoutBook.execute();
        assertEquals("Enter A BOOK Name\n", outputStream.toString());
        verify(library).checkoutItem("Java", RentableType.BOOK);
    }
}
