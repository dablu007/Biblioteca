package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ViewInvalidMessageTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void shouldShowCheckoutMessageForCheckout() {
        IView invalidMessageView = new ViewInvalidMessage();
        invalidMessageView.show();
        assertEquals("Select a valid option!\n", outContent.toString());
    }
}
