package com.twu.biblioteca.view;

import com.twu.biblioteca.model.RentableType;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class ViewCheckoutTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void shouldShowCheckoutMessageForCheckoutBook() {
        IView viewCheckoutBook = new ViewCheckout(RentableType.BOOK);
        viewCheckoutBook.show();
        assertEquals("Thank you! Enjoy the BOOK\n", outContent.toString());
    }
}
