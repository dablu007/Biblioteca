package com.twu.biblioteca;

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
        assertEquals("Books Successfully Checkout\n", outContent.toString());
    }
}
