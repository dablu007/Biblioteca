package com.twu.biblioteca.view;

import com.twu.biblioteca.view.IView;
import com.twu.biblioteca.view.ViewCheckoutBook;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewCheckoutBookTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void shouldShowCheckoutMessageForCheckout() {
        IView viewCheckoutBook = new ViewCheckoutBook();
        viewCheckoutBook.show();
        assertEquals("Thank you! Enjoy the book\n", outContent.toString());
    }
}
